class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "VDJS";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("J", 6, 200);
        Course c2 = new Course("P", 4, 150);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        System.out.println("Institute Name: " + Course.instituteName);

        Course.updateInstituteName("GLA");
        System.out.println("Updated Institute Name: " + Course.instituteName);
    }
}
