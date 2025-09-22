package Box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(Box other) {
        this(other.width, other.width, other.height);
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

    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public int compare(Box other) {
        double currentVolume = getVolume();
        double otherVolume = other.getVolume();

        int result;
        if (currentVolume > otherVolume) {
            result = 1;
        } else if (currentVolume < otherVolume) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        double volume = getVolume();
        System.out.printf("• volume = %.1f \n", volume);
    }
}
