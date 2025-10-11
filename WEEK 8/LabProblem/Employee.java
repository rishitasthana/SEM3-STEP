// All classes in one file: PayrollTest.java

abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();
}

interface Payable {
    void generatePaySlip();
}

class Manager extends Employee implements Payable {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        // Example: Manager gets 20% of salary as bonus
        return salary * 0.20;
    }

    @Override
    public void generatePaySlip() {
        System.out.println("Pay Slip for Manager");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Pay: " + (salary + calculateBonus()));
    }
}

public class PayrollTest {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 80000, "HR");
        mgr.generatePaySlip();
    }
}