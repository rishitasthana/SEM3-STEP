// University Library System - Upcasting

abstract class LibraryUser {
    protected String name;
    protected String userId;

    public LibraryUser(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public void logEntry() {
        System.out.println(name + " (" + userId + ") entered the library.");
    }

    public void displayInfo() {
        System.out.println("User: " + name + " | ID: " + userId);
    }
}

// Student class
class Student extends LibraryUser {
    public Student(String name, String userId) {
        super(name, userId);
    }

    public void borrowBook(String book) {
        System.out.println("Student " + name + " borrowed: " + book);
    }

    public void accessComputer() {
        System.out.println("Student " + name + " is accessing a library computer.");
    }
}

// Faculty class
class Faculty extends LibraryUser {
    public Faculty(String name, String userId) {
        super(name, userId);
    }

    public void reserveBook(String book) {
        System.out.println("Faculty " + name + " reserved: " + book);
    }

    public void accessResearchDatabase() {
        System.out.println("Faculty " + name + " is accessing research databases.");
    }
}

// Guest class
class Guest extends LibraryUser {
    public Guest(String name, String userId) {
        super(name, userId);
    }

    public void browseBooks() {
        System.out.println("Guest " + name + " is browsing books.");
    }
}

// Demo class
public class LibraryDemo {
    public static void main(String[] args) {
        LibraryUser[] users = new LibraryUser[3];
        users[0] = new Student("Asha", "S101");
        users[1] = new Faculty("Dr. Rao", "F202");
        users[2] = new Guest("Mr. Singh", "G303");

        // Upcasting: treat all as LibraryUser for common operations
        for (LibraryUser user : users) {
            user.logEntry();
            user.displayInfo();
            System.out.println();
        }

        // Downcasting for role-specific actions (example)
        ((Student)users[0]).borrowBook("Data Structures");
        ((Faculty)users[1]).reserveBook("Quantum Physics");
        ((Guest)users[2]).browseBooks();
    }
}