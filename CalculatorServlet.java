import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    private Operations operations = new Operations();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        double result = 0;

        switch (operation) {
            case "add":
                result = operations.add(num1, num2);
                break;
            case "subtract":
                result = operations.sub(num1, num2);
                break;
            case "multiply":
                result = operations.multi(num1, num2);
                break;
            case "divide":
                result = operations.div(num1, num2);
                break;
            case "modulus":
                result = operations.mod(num1, num2);
                break;
            case "exponentiation":
                result = operations.exp(num1, num2);
                break;
            case "square_root":
                result = operations.root(num1);
                break;
            case "factorial":
                result = operations.fac((int) num1);
                break;
        }

        response.setContentType("text/html");
        response.getWriter().println("Result: " + result);
    }
}
