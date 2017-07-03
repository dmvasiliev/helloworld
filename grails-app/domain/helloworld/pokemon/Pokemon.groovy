package helloworld.pokemon

class Pokemon {

    String name

    static belongsTo = User
    static hasMany = [user: User]

    static constraints = {
    }
}
