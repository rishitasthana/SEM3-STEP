import java.util.HashSet;
import java.util.Objects;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals(): students with same id are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return id == other.id;
    }

    // Override hashCode() based on id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student [ID: " + id + ", Name: " + name + "]";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(102, "Priya");
        Student s3 = new Student(101, "Amit Kumar"); // Same id as s1

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3); // Should not be added as duplicate

        System.out.println("HashSet contents:");
        for (Student s : set) {
            System.out.println(s);
        }
    }
}