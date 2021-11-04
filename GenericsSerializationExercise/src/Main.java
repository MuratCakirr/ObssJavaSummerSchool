import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(123,"Murat","Cakir","Istanbul");
        student.addGrade("1",25);
        student.addGrade("2",40);
        student.addGrade("3",40);

        Student student1 = new Student(124,"Kutay","Erten","Balikesir");
        student1.addGrade("1",30);
        student1.addGrade("2",50);
        student1.addGrade("3",45);

        Student student2 = new Student(125,"Fırat","Albayrak","Sakarya");
        student2.addGrade("1",35);
        student2.addGrade("2",55);
        student2.addGrade("3",65);

        Student student3 = new Student(126,"Mehmet","Kömürcü","Urfa");
        student3.addGrade("1",45);
        student3.addGrade("2",65);
        student3.addGrade("3",75);

        Student student4 = new Student(127,"Görkem","Gülmez","Tokat");
        student4.addGrade("1",55);
        student4.addGrade("2",75);
        student4.addGrade("3",85);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("student.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(students);
            oos.close();

            for (Student studentFor:students) {
                System.out.println(studentFor.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
