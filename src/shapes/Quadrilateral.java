package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length, width;
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
