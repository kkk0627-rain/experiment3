public class Course {
    private String title;
    private Building building; // 约束：Course 一定在某个 Building 中进行
    public Course(String title, Building building) {
        this.title = title;
        this.building = building;
    }
    public String getTitle() { return title; }
    public Building getBuilding() { return building; }
}