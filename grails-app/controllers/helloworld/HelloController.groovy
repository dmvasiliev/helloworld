package helloworld

import helloworld.pokemon.User

/**
 * Generate doc
 * @author Vasiliev
 * @version 1.0
 */

class HelloController {
    def index() {
//        forward(view: "hello/index.jsp")
        render(view: '/loginPage')
    }

    def authenticate() {
        def user = User.findAll("from User as u where u.name=:user and u.password=:pass", [user: params.username, pass: params.password])
        if (user) { // if valid store the user in session for check user logged in or not in filter or anywhere
            session.loggedInUser = user
            redirect(controller: 'dashboard', action: 'home')
        } else {
            def msg = "Login failed : Invalid Username / Password !"
            render(view: '/loginPage', model: [msg: msg])
        }

/*        if (params.username && params.password) {
            def user = User.findAll("from User as u where u.name=:user and u.password=:pass", [user: params.username, pass: params.password])
            if (user) {
                session.user = 'admin'
                flash.message = "Login succeed"
                redirect(action: 'index')
            }
        }
//       forward (view: 'hello/index.jsp')
        redirect controller: "hello", action: "index"*/
    }

    def logout() {
        session.user = null
        redirect(action: 'login')
    }


}