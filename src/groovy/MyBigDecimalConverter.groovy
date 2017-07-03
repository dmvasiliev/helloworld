import org.codehaus.groovy.grails.web.servlet.mvc.GrailsWebRequest
import org.grails.databinding.converters.ValueConverter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.servlet.LocaleResolver

import javax.servlet.http.HttpServletRequest
import java.text.NumberFormat

/**
 * Created by vasiliev on 6/27/2017.
 */
class MyBigDecimalConverter implements ValueConverter {

    @Autowired(required = false)
    LocaleResolver localeResolver

    @Override
    boolean canConvert(Object value) {
        value instanceof String
    }

    @Override
    Object convert(Object val) {
        String value = val as String
        def numberFormatter = NumberFormat.getInstance(getLocale())
        if (numberFormatter.symbols.decimalSeparator == "." && (value as String).contains(",")) {
            value = value.replace(",", ".")
        } else if (numberFormatter.symbols.decimalSeparator == "," && (value as String).contains(".")) {
            value = value.replace(".", ",")
        }
//        numberFormatter.setGroupingUsed(false)
        numberFormatter.parse(value).asType(getTargetType())
    }

    @Override
    Class<?> getTargetType() {
        BigDecimal
    }

    protected Locale getLocale() {
        def locale
        def request = GrailsWebRequest.lookup()?.currentRequest
        if (request instanceof HttpServletRequest) {
            locale = localeResolver?.resolveLocale(request)
        }
        if (locale == null) {
            locale = Locale.default
        }
        return locale
    }
}