<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.*, java.util.*, javax.servlet.*, javax.servlet.http.*" %>

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
                     resultado= num1 + num2;
                break;

                case "restar":
                     resultado= num1 - num2;
                break;

                case "multiplicar":
                     resultado= num1 * num2;
                break;

                case "dividir":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    throw new Exception("No se puede dividir por cero.");
                }
                break;

                case "potenciacion":
                     resultado= Math.pow(num1, num2);
                break;

                case "radiacion":
                if (num2 == 0) {
                    throw new Exception("No se puede calcular la raíz de índice 0.");
                }
                resultado = Math.pow(num1, 1.0 / num2); 
                break;

                case "modulo":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    throw new Exception("No se puede calcular el módulo con divisor cero.");
                }
                break;

                case "cociente":
                if (num2 != 0) {
                    resultado = Math.floor(num1 / num2); 
                } else {
                    throw new Exception("No se puede calcular el cociente con divisor cero.");
                }
                break;

                case "MCD":
                int a = (int) num1;
                int b = (int) num2;
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                resultado = a;
                break;

                case "MCM":
                int x = (int) num1;
                int y = (int) num2;
                int mcd = x;
                int tempY = y;
                while (tempY != 0) {
                    int temp = tempY;
                    tempY = mcd % tempY;
                    mcd = temp;
                }
                resultado = Math.abs(x * y) / mcd;
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