package shapes;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        while(true) {
            Input input = new Input();
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            double area = circle.getArea();
            double circumference = circle.getCircumference();
            System.out.printf("Your circle's area is %s and its circumference is %s.", area, circumference);
            if(!input.yesNo("Would you like to make another circle? ")) {
                break;
            }
        }
    }
}
