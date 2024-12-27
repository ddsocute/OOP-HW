
public class Employee {

    private int ID;
    private double baseSalary;
    private double totalSalary;
    private int sales;
    private String name;
    private String department;
    private BankAccount account;

    public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
        this.ID = ID;
        this.name = name;
        this.account = account;
        this.department = department;
        this.baseSalary = baseSalary;
        this.sales = sales;
        totalSalary = 0;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSales() {
        return this.sales;
    }

    public double getTotalSalary() {
        return this.totalSalary;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void monthEnd() {
        double salary = (this.baseSalary + (this.sales * 500)) * 0.97;
        this.totalSalary = salary;
        this.account.deposit(salary);
    }

    public String getInfo() {
        int totalSalary = (int)this.totalSalary;
        String info = String.format("ID:%d\nName:%s\nDepartment:%s.\nTotal sales:%d\nTotal salary:%d\n", this.ID, this.name, this.department, this.sales, totalSalary);
        return info;
    }
}
