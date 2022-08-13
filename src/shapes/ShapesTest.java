package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        double area = box1.getArea();
        double perimeter = box1.getPerimeter();
        System.out.format("Your rectangle's area is %s and its perimeter is %s", area, perimeter);
        Rectangle box2 = new Square(5);
        area = box2.getArea();
        perimeter = box2.getPerimeter();
        System.out.format("%nYour square's area is %s and its perimeter is %s", area, perimeter);
    }
}

//    Input input = new Input();
//    double length = input.getDouble("Enter length of rectangle: ");
//    double width = input.getDouble("Enter width of rectangle: ");
