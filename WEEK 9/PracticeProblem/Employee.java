import java.util.HashSet;

class Employee {
    private String empCode;
    private String name;

    public Employee(String empCode, String name) {
        this.empCode = empCode;
        this.name = name;
    }

    // Override equals() - same empCode means same employee
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return empCode != null && empCode.equals(other.empCode);
    }

    // Override hashCode() based on empCode
    @Override
    public int hashCode() {
        return empCode != null ? empCode.hashCode() : 0;
    }

    // toString() showing both fields
    @Override
    public String toString() {
        return "Employee: " + empCode + ", Name: " + name;
    }
}

public class EmployeeAuth {
    public static void main(String[] args) {
        // 1. Employee e1 = new Employee("BL001", "Ritika");
        Employee e1 = new Employee("BL001", "Ritika");
        // 2. Employee e2 = new Employee("BL001", "Ritika S.");
        Employee e2 = new Employee("BL001", "Ritika S.");

        // 3. Compare using e1 == e2 and e1.equals(e2)
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));

        // 4. Test using HashSet<Employee>
        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println("HashSet size: " + set.size());
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}