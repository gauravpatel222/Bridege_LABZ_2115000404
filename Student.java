
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
       
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Guzzar", 9.5);
        System.out.println(s1.getCGPA());
        s1.setCGPA(9);
        PostgraduateStudent pg=new PostgraduateStudent(1, "Gaurab", 1);
        pg.display();
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void display() {
        System.out.println("PG Student Name: " + name);
    }
}

