
public class ITStudent extends MISStudent {

    private int ds;
    private int db;

    public ITStudent(String name, int mis, int oop, int ds, int db) {
        super(name, mis, oop);
        this.ds = ds;
        this.db = db;
    }
    public double getGrade() {
        double grade = super.getGrade() + ds * 0.4 + db * 0.3;
        return grade;
    }
}
