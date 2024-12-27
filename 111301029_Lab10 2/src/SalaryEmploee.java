
public class SalaryEmploee extends Employee {

    private double raiseRate;

    public SalaryEmploee(String name, int onboardYear, double avgSalary) {
        super(name, onboardYear);
        super.setSalary(avgSalary);
    }

    @Override
    public void setSalary(double s) {
        double newSalary = s * raiseRate;
        super.setSalary(newSalary);
    }

    public void setRaiseRate() {
        this.raiseRate = 1 + super.getSeniority()/100.0;
    }

    public double getRaiseRate(){
        return this.raiseRate;
    }
}
