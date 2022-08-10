package shapes;

public class Circle {
    private double radius = 1;
    public Circle(double input) {
        radius = input;
    }
    public static void main(String[] args) {
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getArea(double input) {
        return Math.PI * Math.pow(input, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getCircumference(double input) {
        return 2 * Math.PI * input;
    }
}
