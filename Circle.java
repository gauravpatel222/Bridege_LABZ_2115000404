class Circle {
    double radius;

   
    public Circle() {
        this(1.0); 
    }

   
    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        System.out.println("Default Circle:");
        defaultCircle.displayRadius();
        System.out.println("\nCustom Circle:");
        customCircle.displayRadius();
    }
}
