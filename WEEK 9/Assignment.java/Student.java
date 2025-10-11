import java.util.HashSet;
import java.util.Objects;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Override equals(): students with same rollNo are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.rollNo == other.rollNo;
    }

    // Override hashCode() based on rollNo
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student [RollNo: " + rollNo + ", Name: " + name + "]";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(2, "Priya");
        Student s3 = new Student(1, "Amit Kumar"); // Same rollNo as s1

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