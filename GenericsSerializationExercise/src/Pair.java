import java.io.Serializable;

public class Pair<C,G> implements Serializable {
    private C courseId;
    private G grade;

    public Pair(C courseId, G grade) {
        this.courseId = courseId;
        this.grade = grade;
    }

    public C getCourseId() {
        return courseId;
    }

    public G getGrade() {
        return grade;
    }

}
