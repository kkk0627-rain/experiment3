public class Thoroughbred {
    private Thoroughbred mother;
    private Thoroughbred father;
    private int birthyear;

    public Thoroughbred() {}

    public Thoroughbred(Thoroughbred mother, Thoroughbred father, int birthyear) {
        this.mother = mother;
        this.father = father;
        this.birthyear = birthyear;
    }

    public int getCurrentAge() {
        return java.time.Year.now().getValue() - birthyear;
    }

    public Thoroughbred getFather() { return father; }
    public Thoroughbred getMother() { return mother; }

    public void setMother(Thoroughbred mother) { this.mother = mother; }
    public void setFather(Thoroughbred father) { this.father = father; }
    public void setBirthyear(int birthyear) { this.birthyear = birthyear; }

    public static void main(String[] args) {
        Thoroughbred m = new Thoroughbred(null, null, 2015);
        Thoroughbred f = new Thoroughbred(null, null, 2013);
        Thoroughbred foal = new Thoroughbred(m, f, 2022);
        System.out.println("Current age: " + foal.getCurrentAge());
        System.out.println("Mother birthyear: " + foal.getMother().birthyear);
        System.out.println("Father birthyear: " + foal.getFather().birthyear);
    }
}