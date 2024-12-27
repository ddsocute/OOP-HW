import java.util.ArrayList;
public class Supervisor extends Employee{
    private ArrayList<Employee> subordinates;

    Supervisor(int ID, String name, BankAccount account, String department, int baseSalary, int sales, ArrayList<Employee> subordinates){
        super(ID, name, account, department,baseSalary, sales);
        int totalSales = sales;
        for(Employee subordinate:subordinates){
            totalSales += subordinate.getSales();
        }
        this.setSales(totalSales);
    }
}