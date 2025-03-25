package calculadora;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
 
@WebServlet("/calcular")
public class CalculadoraServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operacion = request.getParameter("operacion");
            double resultado = 0;

            switch (operacion) {
                case "sumar":
                    resultado = num1 + num2;
                    break;
                case "restar":
                    resultado = num1 - num2;
                    break;
                case "multiplicar":
                    resultado = num1 * num2;
                    break;
                case "dividir":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    resultado = num1 / num2;
                    break;
                case "potenciacion":
                    resultado = Math.pow(num1, num2);
                    break;
                case "radiacion":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede calcular la raíz de índice 0.");
                    }
                    resultado = Math.pow(num1, 1.0 / num2);
                    break;
                case "modulo":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede calcular el módulo con divisor cero.");
                    }
                    resultado = num1 % num2;
                    break;
                case "cociente":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede calcular el cociente con divisor cero.");
                    }
                    resultado = Math.floor(num1 / num2);
                    break;
                case "MCD":
                    resultado = calcularMCD((int) num1, (int) num2);
                    break;
                case "MCM":
                    resultado = calcularMCM((int) num1, (int) num2);
                    break;
                default:
                    throw new IllegalArgumentException("Operación inválida.");
            }

    
            request.setAttribute("resultado", resultado);
            request.getRequestDispatcher("resultado.jsp").forward(request, response);

        } catch (NumberFormatException e) {
            request.setAttribute("error", "Por favor, ingrese números válidos.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private int calcularMCM(int a, int b) {
        return Math.abs(a * b) / calcularMCD(a, b);
    }
}