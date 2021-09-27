package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first_number");
        String second = request.getParameter("second_number");
        String plus = request.getParameter("plus");
        String minus = request.getParameter("minus");
        String multiply = request.getParameter("multiply");
        String modulus = request.getParameter("modulus");
        request.setAttribute("firstNum", first);
        request.setAttribute("secondNum", second);
        if (first == null || first.equals("") || second == null || second.equals("")){
            request.setAttribute("result", "Invalid");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
        }
        try {
            Integer.parseInt(first);
            Integer.parseInt(second);
            if (plus != null){
                request.setAttribute("result", Integer.parseInt(first) + Integer.parseInt(second));
            }
            if (minus != null){
                request.setAttribute("result", Integer.parseInt(first) - Integer.parseInt(second));
            }
            if (multiply != null){
                request.setAttribute("result", Integer.parseInt(first) * Integer.parseInt(second));
            }
            if (modulus != null){
                request.setAttribute("result", Integer.parseInt(first) % Integer.parseInt(second));
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
    }
    

}