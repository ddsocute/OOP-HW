
public class Employee {

    private String name;
    private int onboardYear;
    private int seniority;
    private double salary;

    public Employee(String name, int onboardYear) {
        this.name = name;
        this.onboardYear = onboardYear;
    }

    public String getName() {
        return this.name;
    }

    public int getOnboardYear() {
        return this.onboardYear;
    }

    public int getSeniority() {
        return seniority;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public void setSalary(double salary){
        this.salary = salary;

    }
}
