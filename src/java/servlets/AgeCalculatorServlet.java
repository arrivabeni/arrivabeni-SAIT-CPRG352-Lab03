package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcelo Vieira
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean doCalculation = true;
        // Capture the incoming parameters from JSP
        String age = request.getParameter("age");

        if (age.isEmpty()) {
            doCalculation = false;
            request.setAttribute("message", "You must give your current age.");
        }

        if (!isValidNumber(age)) {
            doCalculation = false;
            request.setAttribute("message", "You must enter a number.");
        }

        if (doCalculation) {
            // If not message was defined, the age is valid to start calculations
            int age_i = Integer.parseInt(age);
            age_i++;
            request.setAttribute("age", age_i);
            request.setAttribute("message", String.format("Your age next birthday will be %d", age_i));
        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return;

    }

    public boolean isValidNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
