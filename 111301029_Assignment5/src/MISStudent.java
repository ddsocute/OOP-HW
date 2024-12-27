
public class MISStudent {

    private String name;
    private int mis;
    private int oop;

    public MISStudent(String name, int mis, int oop) {
        this.name = name;
        this.mis = mis;
        this.oop = oop;
    }

    public double getGrade() {
        double grade = mis * 0.2 + oop * 0.1;
        return grade;
    }

    public String getName() {
        return name;
    }
}
