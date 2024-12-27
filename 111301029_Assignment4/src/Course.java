
public class Course {

    private int courseId;
    private String courseName;
    private int credits;
    private int capacity;
    private int enrolled;

    Course(int id, String name, int credits, int capacity) {
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCoruseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        if (enrolled < capacity) {
            return true;
        } else {
            return false;
        }
    }

    public void enroll() {
        enrolled++;
    }

    public void drop() {
        enrolled--;
    }

    public String getInfo() {
        return String.format("%d %s %d %d/%d", courseId, courseName, credits, enrolled, capacity);
    }
}
