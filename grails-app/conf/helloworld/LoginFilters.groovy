package helloworld

class LoginFilters {

    def filters = {
        all(controller: 'hello', action: 'login', invert: true) {
            before = {
                println "Filter"
               /* if (!session.user && !actionName.equals('login')) {
                    redirect(action: 'login')
                    return false
                }*/
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
