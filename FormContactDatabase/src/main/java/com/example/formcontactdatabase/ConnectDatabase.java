package com.example.formcontactdatabase;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class ConnectDatabase {
    private PreparedStatement preparedStatement;
    private Statement statement;
    private Connection connection;

    public ConnectDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/contactmanagement",
                    "root","admin123");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertContact(String name,String tel){
        try {
            if(name != null) {
                String queryInsert = "INSERT INTO contacts VALUES(?, ?)";

                this.preparedStatement = connection.prepareStatement(queryInsert);

                preparedStatement.setString(1, name);
                preparedStatement.setString(2, tel);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectContact(String name, HttpServletRequest req, HttpServletResponse resp){
        try {
            String queryInsert = "SELECT * FROM contacts WHERE name='"+name+"'";
            this.statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(queryInsert);
            
            while (resultSet.next()){
                req.setAttribute("name",resultSet.getString(1));
                req.setAttribute("tel_number",resultSet.getString(2));
            }

            req.getRequestDispatcher("EditContact.jsp").forward(req,resp);

        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    public void updateTel(String name,String tel){
        try {
            String queryInsert = "UPDATE contacts SET tel_number= ? WHERE name= ?";
            preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setString(1,tel);
            preparedStatement.setString(2,name);

            preparedStatement.executeUpdate();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
