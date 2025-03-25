<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8"/>
        <title>Calculadora JSP</title>
    </head>
<body>
<h2>Calculadora en JSP</h2>
<form action="calcular.jsp" method="post">
    <input type="number" name="num1" required/>
    <select name="operacion">
        <option value="sumar">+</option>
        <option value="restar">-</option>
        <option value="multiplicar">x</option>
        <option value="dividir">/</option>
        <option value="potenciacion">^</option>
        <option value="radiacion">√</option>
        <option value="modulo">%</option>
        <option value="cociente">//</option>
        <option value="MCD">MCD</option>
        <option value="MCM">MCM</option>

    </select>
    <input type="number" name="num2" required/>
    <button type="submit">Calcular</button>

</form>
</body>
</html>