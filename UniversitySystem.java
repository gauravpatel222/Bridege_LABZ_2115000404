import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("  Professor: " + professor.getName());
        }
        System.out.println("  Students:");
        for (Student s : enrolledStudents) {
            System.out.println("  - " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  - " + c.courseName);
        }
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student gaurav = new Student("Gaurav");
        Student guzzar = new Student("Guzzar");

        Course java = new Course("Java Programming");
        Course dsa = new Course("Data Structures");

        Professor drSharma = new Professor("Dr. Sharma");
        java.assignProfessor(drSharma);

        gaurav.enrollCourse(java);
        gaurav.enrollCourse(dsa);
        guzzar.enrollCourse(java);

        java.displayDetails();
        System.out.println();
        
        dsa.displayDetails();
    }
}
