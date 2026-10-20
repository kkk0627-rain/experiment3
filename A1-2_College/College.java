import java.util.ArrayList;
import java.util.List;

public class College {
    private List<Building> buildings = new ArrayList<>(); // 聚合
    private List<Course> courses = new ArrayList<>();     // 组合

    public void addBuilding(Building b) { buildings.add(b); }
    public void addCourse(Course c) { courses.add(c); }

    public List<Building> getBuildings() { return buildings; }
    public List<Course> getCourses() { return courses; }

    public static void main(String[] args) {
        College college = new College();
        Building b1 = new Building("教学楼A");
        college.addBuilding(b1);
        college.addCourse(new Course("软件工程", b1));
        System.out.println("College has " + college.getBuildings().size() + " building(s)");
        System.out.println("College has " + college.getCourses().size() + " course(s)");
    }
}