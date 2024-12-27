
import java.util.ArrayList;

public class Lab10 {

    public static void main(String[] args) throws Exception {
        SalaryEmploee se1 = new SalaryEmploee("John", 2017, 50000);
        SalaryEmploee se2 = new SalaryEmploee("Peter", 2021, 45000);
        HourlyEmployee he1 = new HourlyEmployee("Jason", 2018, 450, 80);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(se1);
        employees.add(se2);
        employees.add(he1);

        for (Employee e : employees) {
            System.out.println(presentResult(2022, e));
        }
        System.out.println(" ");
        for (Employee e : employees) {
            System.out.println(presentResult(2023, e));
        }
    }

    public static String presentResult(int year, Employee e) {
        e.setSeniority(year - e.getOnboardYear());
        if (e instanceof SalaryEmploee) {
            SalaryEmploee se = (SalaryEmploee) e;
            se.setRaiseRate();
            se.setSalary(60000);
        }

        if (e instanceof HourlyEmployee) {
            HourlyEmployee he = (HourlyEmployee) e;
            he.updateSalary(500, 90);
        }
        return String.format("%s's salary for %d: %.0f",
                e.getName(), year, e.getSalary());
    }

}
