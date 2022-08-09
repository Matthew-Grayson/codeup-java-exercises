package shapes;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble();
        double area = Circle.getArea(radius);
        double circumference = Circle.getCircumference(radius);
        System.out.printf("Your circle's area is %s and its circumference is %s.", area, circumference);
    }
}
