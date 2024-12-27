
import java.util.ArrayList;
import java.util.Iterator;

public class Student {

    private int studentId;
    private String studentName;
    private ArrayList<Course> enrolledCourses;
    private int currentCredits;
    private int maxCredits;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.studentName = name;
        this.maxCredits = 25;
        this.currentCredits = 0;
        this.enrolledCourses = new ArrayList<>();
    }

    public Student(int studentId, String name, int maxCredits) {
        this.studentId = studentId;
        this.studentName = name;
        this.maxCredits = maxCredits;
        this.currentCredits = 0;
        this.enrolledCourses = new ArrayList<>();
    }

    public Course getCourse(int id) {
        for (Course course : enrolledCourses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    public void enroll(Course course) {
        int afterenroll = currentCredits + course.getCredits();
        if (course.isFull()) {
            if ( afterenroll <= maxCredits) {
                enrolledCourses.add(course);
                course.enroll();
                currentCredits = afterenroll;
            } else {
                System.out.printf("Student %d cannot enroll this course\n", studentId);
            }
        } else {
            System.out.printf("Course %d is full\n", course.getCourseId());
        }
    }

    public void drop(int courseID) {
        Iterator<Course> iterator = enrolledCourses.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (courseID == course.getCourseId()) {
                course.drop();
                currentCredits -= course.getCredits();
                iterator.remove(); // 安全地刪除當前元素
                found = true;
                break; // 找到並刪除後可以退出
            }
        }

        if (!found) {
            System.out.printf("Course %d not found in student %d\n", courseID, studentId);
        }
    }

    public void drop(Course course) {
        Iterator<Course> iterator = enrolledCourses.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Course listCourse = iterator.next();
            if (listCourse.getCourseId() == course.getCourseId()) {
                course.drop();
                currentCredits -= course.getCredits();
                iterator.remove(); // 安全地刪除當前元素
                found = true;
                break; // 找到並刪除後可以退出
            }
        }

        if (!found) {
            System.out.printf("Course %d not found in student %d\n", course.getCourseId(), studentId);
        }
    }

    public String getInfo() {
        String lineCourse = "";
        for (Course course : enrolledCourses) {
            lineCourse += String.format("%d %s %d\n", course.getCourseId(), course.getCoruseName(), course.getCredits());
        }
        return String.format("Student Id: %d\nName: %s\nCredits: %d/%d\nCourse list:\n%s", studentId, studentName, currentCredits, maxCredits, lineCourse);
    }
}
