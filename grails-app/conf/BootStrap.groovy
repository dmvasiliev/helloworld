import helloworld.pokemon.Pokemon
import helloworld.pokemon.User

import java.sql.Date

class BootStrap {

    def init = { servletContext ->
        println "print message after starting"

        fillDB()

    }

    def destroy = {
    }

    private void fillDB() {
        if (Pokemon.count() == 0) {
            def pippi = new Pokemon(name: 'Pippi')
            pippi.save()

            def pippi2 = new Pokemon(name: 'Pippi')
            pippi2.save()

            def pippi3 = new Pokemon(name: 'Pippi')
            pippi3.save()

            def sando = new Pokemon(name: 'Sando')
            sando.save()

            def poppo = new Pokemon(name: 'Poppo')
            poppo.save()

            def ratta = new Pokemon(name: 'Ratta')
            ratta.save()

            def sandopan = new Pokemon(name: 'Sandopan')
            sandopan.save()

            def nidorina = new Pokemon(name: 'Nidorina')
            nidorina.save()

            def vulpix = new Pokemon(name: 'Vulpix')
            vulpix.save()

            def vulpixAdmin = new Pokemon(name: 'Vulpix')
            vulpixAdmin.save()

            def nidorinaAdmin = new Pokemon(name: 'Nidorina')
            nidorinaAdmin.save()

            if (User.count() == 0) {

                def calendar = Calendar.getInstance()
                calendar.set(1990, 12, 12)
                new User(name: 'Nikolay', password: 'nik', birthday: new Date(calendar.getTimeInMillis()))
                        .addToPokemon(pippi)
                        .addToPokemon(pippi2)
                        .save()

                calendar.set(1980, 05, 15)
                def roman = new User(name: 'Roman', password: 'rom', birthday: new Date(calendar.getTimeInMillis()))
                roman.addToPokemon(poppo)
                        .addToPokemon(sando)
                        .addToPokemon(pippi3)
                        .save()

                calendar.set(1985, 01, 20)
                new User(name: 'Dmitry', password: 'dmi', birthday: new Date(calendar.getTimeInMillis()))
                        .addToPokemon(ratta)
                        .save()

                calendar.set(1985, 01, 20)
                new User(name: 'Oleg', password: 'ole', birthday: new Date(calendar.getTimeInMillis()))
                        .addToPokemon(ratta)
                        .save()

                calendar.set(1987, 03, 18)
                new User(name: 'Olga', password: 'olg', birthday: new Date(calendar.getTimeInMillis()))
                        .addToPokemon(nidorina)
                        .save()

                calendar.set(1984, 03, 10)
                new User(name: 'Alex', password: 'ale', birthday: new Date(calendar.getTimeInMillis()))
                        .addToPokemon(vulpix)
                        .save()

                calendar.set(1985, 04, 05)
                def admin = new User(name: 'Admin', password: 'admin', birthday: new Date(calendar.getTimeInMillis()))
                admin.addToPokemon(poppo)
                        .addToPokemon(nidorinaAdmin)
                        .addToPokemon(vulpixAdmin)
                        .save()
            }
        }
    }
}
