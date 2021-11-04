import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> employees;

        RelationalModel relationalModel = new RelationalModel("jdbc:mysql://localhost/empmanagement",
                "root","admin123");

        employees = relationalModel.listEmployees(OrderField.BIRTHYEAR);
        for (Employee employee:employees) {
            System.out.println(employee.toString());
        }
    }
}
