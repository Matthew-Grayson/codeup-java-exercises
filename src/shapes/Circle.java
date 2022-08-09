package shapes;

public class Circle {
    private static double radius = 1;
    public Circle(double input) {
        radius = input;
    }
    public static void main(String[] args) {

    }
    public static double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double getArea(double input) {
        return Math.PI * Math.pow(input, 2);
    }

    public static double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public static double getCircumference(double input) {
        return 2 * Math.PI * input;
    }
}
