/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ValidaLogin", urlPatterns = {"/valida_login.java"})
public class ValidaLogin extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        String userDb = "email@email.com";
        String passDb = "senha1234";
        
        if(user.equals(userDb)&& pass.equals(passDb)){
            HttpSession session = request.getSession();
            session.setAttribute("userLogged", user);
            
            request.setAttribute("userLogged", user);
            request.getRequestDispatcher("home.jsp")
                    .forward(request, response);   
        } else {
        PrintWriter out = response.getWriter();
        out.print(
        "<script>"
        + "alert('Acesso Negado');"
        + "window.location.replace('index.html');"
        + "</script>"
        );
        }
        
        
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidaLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ValidaLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
