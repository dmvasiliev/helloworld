<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Users Info</title>
</head>

<body>
<g:each in="${users}" var="user" status="i">
    <h3>${i + 1}. ${user.name}, ${user.birthday}</h3>
    <p>
        pokemons: ${user.name}
    </p>
    <br/>
</g:each>
</body>
</html>