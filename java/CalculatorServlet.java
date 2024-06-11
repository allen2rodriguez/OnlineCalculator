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
        String input = request.getParameter("input");
        double result = evaluate(input);

        response.setContentType("text/html");
        response.getWriter().println("Result: " + result);
    }

    private double evaluate(String input) {
        // Parse and evaluate the input string using your Operations class
        // This is a simplified example and doesn't handle errors or complex expressions
        String[] tokens = input.split(" ");
        double num1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        switch (operator) {
            case "+":
                return operations.add(num1, num2);
            case "-":
                return operations.sub(num1, num2);
            case "*":
                return operations.multi(num1, num2);
            case "/":
                return operations.div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}
