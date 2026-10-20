import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Instructor> instructors = new ArrayList<>(); // 至少1位
    private List<Subject> subjects = new ArrayList<>();       // 至少1门
    public Department(String name) { this.name = name; }
    public void addInstructor(Instructor i) {
        instructors.add(i);
        i.setDepartment(this);
    }
    public void addSubject(Subject s) { subjects.add(s); }
    public List<Instructor> getInstructors() { return instructors; }
    public List<Subject> getSubjects() { return subjects; }
}