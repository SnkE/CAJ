<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Suma</title>
</head>
<body>
    <h2>Resultado de la Suma</h2>
    <p>La suma es: <strong><%= request.getAttribute("resultado") %></strong></p>
    <a href="index.jsp">Volver a sumar</a>
</body>
</html>