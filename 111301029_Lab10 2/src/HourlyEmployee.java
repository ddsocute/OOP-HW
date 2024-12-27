public class HourlyEmployee extends Employee{
    private double wageHour;
    private double workingHour;

    public HourlyEmployee(String name, int onboardYear, double wageHour, double workingHours){
        super(name, onboardYear);
        this.wageHour = wageHour;
        this.workingHour = workingHours;
    }

    public void updateSalary(double newWageHour, double newWorkingHour){
        double newSalary =  newWageHour *newWorkingHour;
        super.setSalary(newSalary);
    }
}
