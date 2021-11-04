package com.example.formcontactdatabase;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/create-contact")
public class CreateContactServlet extends HttpServlet {
    private ConnectDatabase connectDatabase;
    @Override
    public void init() throws ServletException {
        connectDatabase = new ConnectDatabase();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String tel = req.getParameter("tel_number");
        connectDatabase.insertContact(name,tel);
        PrintWriter out = resp.getWriter();
        out.println(name + " Contact added");
    }

    public void destroy() {
    }
}