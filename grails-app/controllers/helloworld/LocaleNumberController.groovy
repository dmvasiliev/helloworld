package helloworld

class LocaleNumberController {

    def index() {
        LocaleNumber localeNumber = new LocaleNumber(params)
        render(view: 'localenumber.gsp', model: [localeNumber: localeNumber])
    }

    def convertAndShow() {
        LocaleNumber localeNumber = new LocaleNumber(params)
        localeNumber.save()
        redirect(action: 'index', params: [someNumber: params.someNumber])
    }
}
