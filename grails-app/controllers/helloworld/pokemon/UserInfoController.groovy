package helloworld.pokemon

class UserInfoController {

    def index() {
        params.max = params.max ? params.max : 2
        params.offset = params.offset ? params.offset : 0

        def userList = User.createCriteria().list(params) {
            if (params.userName) {
                def filter = (params.userName as String).replace('*', '%')
                ilike("name", "${filter}")
            }
        }
        [users: userList, userCount: (params.userName || params.pokemonName) ? userList.size() : User.count]
    }
}
