package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
        this.length = side;
        this.width = side;
    }
    @Override
    public double getPerimeter() {
        return length * 4 ;
    }
    @Override
    public double getArea() {
        return length * 2;
    }
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
};
