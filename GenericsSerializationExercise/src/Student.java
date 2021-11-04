import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private int Id;
    private String name;
    private String surname;
    private String address;
    private transient double cumulativeGpa = 0;
    private List<Pair<String,Double>> grades = new ArrayList<>();

    public Student(int id, String name, String surname, String address) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public void addGrade(String courseId, double grade){

        double total = 0;

        grades.add(new Pair(courseId,grade));

        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i).getGrade();
        }

        this.cumulativeGpa = total / grades.size();

    }

    private void readObject(ObjectInputStream serialized) throws ClassNotFoundException, IOException
    {
        serialized.defaultReadObject();
        cumulativeGpa(this);
    }

    private void cumulativeGpa(Student student){
        double total = 0;

        for (int i = 0; i < student.getGrades().size(); i++) {
            total += student.getGrades().get(i).getGrade();
        }

        student.setCumulativeGpa(total / student.getGrades().size());
    }

    public double getCumulativeGpa() {

        return cumulativeGpa;
    }

    public void setCumulativeGpa(double cumulativeGpa) {
        this.cumulativeGpa = cumulativeGpa;
    }

    public List<Pair<String, Double>> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", cumulativeGpa=" + cumulativeGpa +
                '}';
    }
}
