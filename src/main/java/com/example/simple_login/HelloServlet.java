package com.example.simple_login;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        if ("admin".equals(username)&&"admin".equals(password)){
            writer.println("<h1>wellcome"+username+"to website</h1>");
        }else {
            writer.println("<h1>Login error</h1>");
        }
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//       PrintWriter writer=resp.getWriter();
//       writer.println("<html>");
//       if ("admin".equals(username)&&"admin".equals(password)){
//           writer.println("<h1>wellcome"+username+"to website</h1>");
//       }else {
//           writer.println("<h1>Login error</h1>");
//       }
//       writer.println("</html>");

    }

    public void destroy() {
    }
}