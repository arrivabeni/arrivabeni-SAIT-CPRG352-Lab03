package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcelo Vieira
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("result", "---");

        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int first = 0;
        int second = 0;
        int resultInt = 0;
        String result = "---";

        String firstArgument = request.getParameter("first_arg");
        String secondArgument = request.getParameter("second_arg");
        String operation = request.getParameter("operation");

        try {
            first = Integer.parseInt(firstArgument);
            second = Integer.parseInt(secondArgument);

            switch (operation) {
                case "+":
                    resultInt = first + second;
                    break;
                case "-":
                    resultInt = first - second;
                    break;
                case "*":
                    resultInt = first * second;
                    break;
                case "%":
                    resultInt = first % second;
                    break;
                default:
                    // Once the input value comes from the submit button, it is not 
                    // supposed to happen
                    resultInt = 0;
            }

            result = Integer.toString(resultInt);

        } catch (Exception e) {
            result = "invalid";
        }

        // Set attributes to return to the user
        request.setAttribute("firstArg", firstArgument);
        request.setAttribute("secondArg", secondArgument);

        request.setAttribute("result", result);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return;
    }

}
