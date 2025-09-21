package Classes;

public class Rect {
    public double length;
    public double width;

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
