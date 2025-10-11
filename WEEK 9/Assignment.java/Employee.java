class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override toString() to print employee details
    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: $" + salary + "]";
    }
}

public class EmployeeToStringDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit", 50000);
        Employee e2 = new Employee(2, "Priya", 60000);

        System.out.println(e1);
        System.out.println("Class name: " + e1.getClass().getName());

        System.out.println(e2);
        System.out.println("Class name: " + e2.getClass().getName());
    }
}