<%@ page import="helloworld.LocaleNumber" %>
<html>
<head>
    <title></title>
</head>

<body>
<div>
    index
    %{--Some number: <g:fieldValue bean="${LocaleNumber}" field="someNumber"/>/>--}%
    %{--Some number: <g:textField name="someNumber" value="${helloworld.LocaleNumber.someNumber}"/>--}%
</div>
</body>
</html>