class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;

    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("----------------------");
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1011, "Guzzar", 'A');
        Student s2 = new Student(102, "Gaurav", 'B');

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
