import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Department> departments = new ArrayList<>(); // 1..*
    private List<Student> students = new ArrayList<>();       // 0..*
    public School(String name) { this.name = name; }
    public void addDepartment(Department d) { departments.add(d); }
    public void addStudent(Student s) { students.add(s); }
    public List<Department> getDepartments() { return departments; }
    public List<Student> getStudents() { return students; }

    public static void main(String[] args) {
        School school = new School("计算机学院");
        Department d = new Department("软件工程系");
        Subject s1 = new Subject("软件工程");
        Instructor i = new Instructor("张老师");
        d.addSubject(s1);
        d.addInstructor(i);
        i.addSubject(s1);
        school.addDepartment(d);
        Student stu = new Student("李同学");
        stu.addSubject(s1);
        school.addStudent(stu);
        System.out.println("OK");
    }
}