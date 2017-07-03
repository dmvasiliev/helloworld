dataSource {
    pooled = true
    dbCreate = "create-drop"
    url = "jdbc:mysql://localhost:3306/hwdb"
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = ""
}

enviroments {
    development {
        dataSource {
            dbCreate = "create-drop"
            url = "jdbc:mysql://localhost:3306/hwdb"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/hwtest"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/hwprod"
        }
    }
}