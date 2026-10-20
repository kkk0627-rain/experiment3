import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String name;
    private Department department; // 至少属于某个系
    private List<Subject> subjects = new ArrayList<>(); // 1..3 门
    public Instructor(String name) { this.name = name; }
    public void setDepartment(Department d) { this.department = d; }
    public void addSubject(Subject s) {
        if (subjects.size() >= 3) throw new IllegalStateException("最多教3门");
        subjects.add(s);
    }
    public Department getDepartment() { return department; }
    public List<Subject> getSubjects() { return subjects; }
}