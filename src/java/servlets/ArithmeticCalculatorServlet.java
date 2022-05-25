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
        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstArgument = request.getParameter("first_arg");
        String secondArgument = request.getParameter("second_arg");

        // Set attributes to return to the user
        request.setAttribute("first_arg", firstArgument);
        request.setAttribute("second_arg", secondArgument);
        
        double result = 1.0;
        request.setAttribute("result", result);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return;
    }

}
