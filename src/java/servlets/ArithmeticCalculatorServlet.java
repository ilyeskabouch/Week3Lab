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
public class ArithmeticCalculatorServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("msg", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        try {
            int int_first = Integer.parseInt(first);
            int int_second = Integer.parseInt(second);
            switch (operation) {
                case "+":
                    request.setAttribute("msg", int_first + int_second);
                    break;
                case "-":
                    request.setAttribute("msg", int_first - int_second);
                    break;
                case "*":
                    request.setAttribute("msg", int_first * int_second);
                    break;
                case "%":
                    request.setAttribute("msg", int_first / int_second);
                    break;
                default:
                    request.setAttribute("msg", "Nice try bucko");
                    break;
            }
        } catch (NumberFormatException e) {
            request.setAttribute("msg", "Invalid");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }
}
