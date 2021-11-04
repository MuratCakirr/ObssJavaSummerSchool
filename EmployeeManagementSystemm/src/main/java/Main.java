import java.util.List;

public class Main {

    public static void main(String[] args) {


        RelationalModel relationalModel = new RelationalModel("jdbc:mysql://localhost/empmanagement",
                "root","admin123");

        Employee employee1 = new Employee(1,"Murat1","Cakir1","Engineer1",1998);
        Employee employee2 = new Employee(2,"Murat2","Cakir2","Engineer2",1995);
        Employee employee3 = new Employee(3,"Murat3","Cakir3","Engineer3",1991);
        Employee employee4 = new Employee(4,"Murat4","Cakir4","Engineer4",1988);
        Employee employee5 = new Employee(5,"Murat5","Cakir5","Engineer5",1980);

        relationalModel.insertEmployee(employee1);
        relationalModel.insertEmployee(employee2);
        relationalModel.insertEmployee(employee3);
        relationalModel.insertEmployee(employee4);
        relationalModel.insertEmployee(employee5);


    }
}
