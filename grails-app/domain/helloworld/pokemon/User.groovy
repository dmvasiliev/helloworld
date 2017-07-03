package helloworld.pokemon

import java.sql.Date

class User {

    String name
    Date birthday
    String password

    static hasMany = [pokemon: Pokemon]

    static constraints = {
    }
}
