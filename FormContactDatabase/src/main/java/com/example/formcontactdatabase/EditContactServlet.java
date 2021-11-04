package com.example.formcontactdatabase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/edit-contact")
public class EditContactServlet extends HttpServlet {
    private Connection connection;
    private Statement statement;
    private ConnectDatabase connectDatabase;

    public void init() throws ServletException {
        connectDatabase = new ConnectDatabase();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String tel = req.getParameter("tel_number");
        System.out.println(tel);
        connectDatabase.selectContact(name,req,resp);

        if (!tel.equals(req.getAttribute("tel_number")) && tel != ""){
            connectDatabase.updateTel(name,tel);
        }

    }

    public void destroy() {
    }
}
