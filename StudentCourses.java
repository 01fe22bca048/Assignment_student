package Assignment_student;


import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    protected Map<String, Map<String, Integer>> courseInformation;

    public StudentCourses() {
        courseInformation = new HashMap<>();
    }

    public void addCourseInfo(String semester, String courseName, int marksObtained) {
        courseInformation.putIfAbsent(semester, new HashMap<>());
        courseInformation.get(semester).put(courseName, marksObtained);
    }

    public void displayCourseInfo() {
        for (Map.Entry<String, Map<String, Integer>> entry : courseInformation.entrySet()) {
            String semester = entry.getKey();
            System.out.println("Semester: " + semester);
            Map<String, Integer> courses = entry.getValue();
            for (Map.Entry<String, Integer> courseEntry : courses.entrySet()) {
                String courseName = courseEntry.getKey();
                int marks = courseEntry.getValue();
                System.out.println("Course: " + courseName + ", Marks Obtained: " + marks);
            }
        }
    }
}