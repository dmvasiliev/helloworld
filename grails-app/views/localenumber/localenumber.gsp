<html>
<head>
    <title>Locale number</title>
    <meta name="layout" content="main"/>
</head>

<body>
<div>
    <br/>
    Some number: <g:fieldValue bean="${localeNumber}" field="someNumber"/>
    <br/>
    <g:form action="convertAndShow">
        Change number to: <g:textField name="someNumber" value="${localeNumber.someNumber}"/>
        <g:submitButton name="convert" value="convertAndShow"/>
    </g:form>

</div>
</body>
</html>