public class Employee {
    private int id;
    private String name;
    private String surname;
    private String title;
    private int birthyear;

    public Employee(int id, String name, String surname, String title, int birthyear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.birthyear = birthyear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTitle() {
        return title;
    }

    public int getBirthyear() {
        return birthyear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", birthyear=" + birthyear +
                '}';
    }
}
