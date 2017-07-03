<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Users Info</title>
</head>

<body>

<g:form action="index" method="post">
    <g:textField id="user_search_tf" class="user_search" name="userName" placeholder="enter user name"/>
    <g:textField id="pokemon_search_tf" class="pokemon_search" name="pokemonName" placeholder="enter pokemon name"/>
    <g:hiddenField name="offset" value="0"/>

    <g:submitButton name="search_submit" value="Search"/>
</g:form>

<g:each in="${users}" var="user" status="i">
    <h3>${user.id}. ${user.name}</h3>
    catched pokemons:
    <br/>
    <g:each in="${user.pokemon}" var="pokemon" status="j">
        * ${pokemon.name}
        <br/>
    </g:each>

    <br/>
</g:each>

<div class="pagination">
    <g:paginate next="Forward" prev="Back"
                controller="userInfo"
                action="index" total="${userCount}"/>

</div>
</body>
</html>