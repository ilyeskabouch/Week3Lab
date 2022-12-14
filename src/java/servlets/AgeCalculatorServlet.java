package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ilyes
 */
public class AgeCalculatorServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        
        
        request.setAttribute("age", age);
        try {
            int int_age = Integer.parseInt(age);
            request.setAttribute("msg", "Your age next birthday will be " + (int_age +1) + "<br>");
        } catch (Exception e) {
            request.setAttribute("msg", "Please input a valid age.<br>");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
}
