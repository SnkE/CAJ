<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8"/>
    <title>Resultado</title>
</head>
<body>
    <h2>Resultado de la Operación</h2>

    <% if (request.getAttribute("resultado") != null) { %>
        <p>El resultado es: <strong><%= request.getAttribute("resultado") %></strong></p>
    <% } else { %>
        <p style="color: red;">Error en la operación.</p>
    <% } %>

    <a href="index.jsp">Volver</a>
</body>
</html>