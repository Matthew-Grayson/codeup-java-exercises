package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Measurable shape1 = new Rectangle(5, 4);
        System.out.println(shape1.getArea());
        Measurable shape2 = new Square(16);
        System.out.println(shape2.getPerimeter());
    }
}