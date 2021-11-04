import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RelationalModel {

    private Statement statement;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public RelationalModel(String connectionString, String username, String password){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(connectionString,username,password);

            this.statement = connection.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertEmployee(Employee employee){
        try {
        String queryInsert = "INSERT INTO employee VALUES(?, ?, ?, ?, ?)";

            this.preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setInt(1,employee.getId());
            preparedStatement.setString(2,employee.getName());
            preparedStatement.setString(3,employee.getSurname());
            preparedStatement.setString(4,employee.getTitle());
            preparedStatement.setInt(5,employee.getBirthyear());

            preparedStatement.executeUpdate();
            System.out.println(employee.getName() + " Employee added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> listEmployees(OrderField of){
        List<Employee> employees = new ArrayList<Employee>();
        try {

        String queryEmployee = "SELECT * FROM employee ORDER BY " + of +" DESC";

            ResultSet resultSet = statement.executeQuery(queryEmployee);
            while (resultSet.next()){

                employees.add (new Employee(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }


}
