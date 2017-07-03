package helloworld

import org.springframework.context.MessageSource
import org.springframework.web.servlet.support.RequestContextUtils

class LocaleTagLib {

    static namespace = 'my'

    def grailsApplication

    MessageSource messageSource

    def localeDropdownListItems =   { args ->
        List<String> languages = grailsApplication.getConfig().guide.languages

        String uri = args.uri
        for (String lang : languages) {
            String languageCode = "language.$lang"
            def locale = RequestContextUtils.getLocale(request)
            def msg = messageSource.getMessage(languageCode, [] as Object[], null, locale)
            out << "<li><a href='${uri}?lang=${lang}'>${msg}</a></li>"
        }
        out
    }
}
