class Course {
    String courseName;
    int duration; // Duration in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // Discount percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getDiscountedPrice());
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("Java Basics", 4);
        OnlineCourse onlineCourse = new OnlineCourse("React JS", 6, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Full Stack Development", 12, "Coursera", true, 299.99, 20);

        System.out.println("Basic Course Details:");
        basicCourse.displayCourseInfo();
        System.out.println("------------------------------");

        System.out.println("Online Course Details:");
        onlineCourse.displayCourseInfo();
        System.out.println("------------------------------");

        System.out.println("Paid Online Course Details:");
        paidCourse.displayCourseInfo();
    }
}
