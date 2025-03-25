package sumadora;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
 
@WebServlet("/sumar")
public class SumadoraServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int suma = num1 + num2;
 
            request.setAttribute("resultado", suma);
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Por favor ingresa números válidos.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}

