import java.time.LocalDate;
import java.time.Period;

public class Student extends StudentCourses {
    private String name;
    private LocalDate dateOfBirth;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge());
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
        // Creating a new Student
        Student student = new Student("John Doe", LocalDate.of(2000, 1, 1));

        // Displaying student info
        student.displayStudentInfo();

        // Creating and displaying student courses information
        student.addCourseInfo("Semester 1", "Maths", 85);
        student.addCourseInfo("Semester 1", "Physics", 78);
        student.displayCourseInfo();
    }
}
