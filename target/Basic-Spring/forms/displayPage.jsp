<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Page From Login</title>
</head>
<body>
This page is displayPage.jsp<br>

<!-- Getting dynamic values from the servlet -->
The result is = <%= request.getAttribute("result")%><br>

<!-- Getting dynamic values using EL or Expression Language; Add EL to imports -->
The result is = ${result}<br>

</body>
</html>
