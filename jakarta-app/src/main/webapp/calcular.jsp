<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.*, java.util.*, javax.servlet.*, javax.servelt.http.*" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h2>Resultado de la operacion</h2>
        <%
        try{
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operacion= request.getParameter("operacion");
            double resultado= 0;

            switch (operacion){
                case "sumar":
                resultado= num1+ num2;
                break;
                default:
                throw new Exception("Operación invalida");
            }
        %>
        <p> El resultado de <strong> <%= num1 %> </strong> <%= operacion %> <strong> <%= num2 %> </strong> es: <strong> <%= resultado %> </strong> </p>
        <%
        }catch (Exception e){
        %>    
            <p style="color: red;"> Error en la operacion. Verifique los valores ingresados.</p>
        <%
        }
        %>
        
        <a href="index.jsp">Volver</a>

        
    </body>
</html>