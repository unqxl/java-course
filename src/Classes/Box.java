package Classes;

public class Box {
    public double length;
    public double width;
    public double height;

    public Box() {
        this(10);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        double volume = getVolume();
        System.out.printf("• volume = %.1f \n", volume);
    }
}
