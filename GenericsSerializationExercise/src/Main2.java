import java.io.*;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<Student> students;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("student.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);

            students = (ArrayList) ois.readObject();
            ois.close();

            for (Student student:students) {
                System.out.println(student.toString());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
