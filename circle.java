public class circle {
    private double radius;
    public double area(double radius){
                return Math.PI*Math.pow(radius,2);
    }
    public double circumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.area(23));
        System.out.println(c.circumference(2));
    }
}
