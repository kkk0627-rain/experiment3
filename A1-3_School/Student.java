import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Subject> subjects = new ArrayList<>(); // 1..5 门
    public Student(String name) { this.name = name; }
    public void addSubject(Subject s) {
        if (subjects.size() >= 5) throw new IllegalStateException("最多选5门");
        subjects.add(s);
    }
    public List<Subject> getSubjects() { return subjects; }
}