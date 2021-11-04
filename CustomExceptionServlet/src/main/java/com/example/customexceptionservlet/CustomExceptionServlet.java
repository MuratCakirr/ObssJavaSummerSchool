package com.example.customexceptionservlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/hello-servlet")
public class CustomExceptionServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new CustomException("murat");
    }
}