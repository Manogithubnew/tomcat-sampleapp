package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        res.setContentType("text/html");

        if ("admin".equals(user) && "password".equals(pass)) {
            res.getWriter().println("<h2>Login Successful!</h2>");
        } else {
            res.getWriter().println("<h2>Invalid username or password</h2>");
        }
    }
}
:x


