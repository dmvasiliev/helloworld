import helloworld.LocaleTagLib

// Place your Spring DSL code here
beans = {
    localeTagLib(LocaleTagLib) {
        grailsApplication = ref('grailsApplication')
    }

/*    localeResolver(org.springframework.web.servlet.i18n.SessionLocaleResolver) {
        defaultLocale = new Locale("en")
        java.util.Locale.setDefault(defaultLocale)
    }*/

    defaultGrailsBigDecimalConverter(MyBigDecimalConverter)
}
