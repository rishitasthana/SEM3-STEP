import java.time.LocalDate;

// Base class for all courses
class Course {
    protected String title;
    protected String instructor;
    protected LocalDate enrollmentDate;

    public Course(String title, String instructor, LocalDate enrollmentDate) {
        this.title = title;
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
    }

    // Method to be overridden by subclasses
    public void showProgress() {
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled on: " + enrollmentDate);
        System.out.println("Progress: Not specified for base course.");
    }
}

// Video course
class VideoCourse extends Course {
    private double completionPercent;
    private int watchTimeMinutes;

    public VideoCourse(String title, String instructor, LocalDate enrollmentDate, double completionPercent, int watchTimeMinutes) {
        super(title, instructor, enrollmentDate);
        this.completionPercent = completionPercent;
        this.watchTimeMinutes = watchTimeMinutes;
    }

    @Override
    public void showProgress() {
        System.out.println("Video Course: " + title);
        System.out.println("Completion: " + completionPercent + "%");
        System.out.println("Watch Time: " + watchTimeMinutes + " minutes");
    }
}

// Interactive course
class InteractiveCourse extends Course {
    private int quizScore;
    private int projectsCompleted;

    public InteractiveCourse(String title, String instructor, LocalDate enrollmentDate, int quizScore, int projectsCompleted) {
        super(title, instructor, enrollmentDate);
        this.quizScore = quizScore;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public void showProgress() {
        System.out.println("Interactive Course: " + title);
        System.out.println("Quiz Score: " + quizScore + "%");
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}

// Reading course
class ReadingCourse extends Course {
    private int pagesRead;
    private int notesTaken;

    public ReadingCourse(String title, String instructor, LocalDate enrollmentDate, int pagesRead, int notesTaken) {
        super(title, instructor, enrollmentDate);
        this.pagesRead = pagesRead;
        this.notesTaken = notesTaken;
    }

    @Override
    public void showProgress() {
        System.out.println("Reading Course: " + title);
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Notes Taken: " + notesTaken);
    }
}

// Certification course
class CertificationCourse extends Course {
    private int examAttempts;
    private boolean certified;

    public CertificationCourse(String title, String instructor, LocalDate enrollmentDate, int examAttempts, boolean certified) {
        super(title, instructor, enrollmentDate);
        this.examAttempts = examAttempts;
        this.certified = certified;
    }

    @Override
    public void showProgress() {
        System.out.println("Certification Course: " + title);
        System.out.println("Exam Attempts: " + examAttempts);
        System.out.println("Certification Status: " + (certified ? "Certified" : "Not Certified"));
    }
}

// Demo class
public class LearningPlatformDemo {
    public static void main(String[] args) {
        Course[] courses = new Course[4];
        courses[0] = new VideoCourse("Java Basics", "Alice", LocalDate.of(2025, 10, 1), 80.5, 120);
        courses[1] = new InteractiveCourse("Python Projects", "Bob", LocalDate.of(2025, 9, 15), 92, 3);
        courses[2] = new ReadingCourse("Algorithms", "Carol", LocalDate.of(2025, 8, 20), 150, 20);
        courses[3] = new CertificationCourse("Cloud Certification", "Dave", LocalDate.of(2025, 7, 10), 2, true);

        for (Course c : courses) {
            c.showProgress();
            System.out.println();
        }
    }
}