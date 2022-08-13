package shapes;

public class Rectangle {
    private double length = 2;
    private double width = 1;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    public double getArea() {
        return length * width;
    }

}
