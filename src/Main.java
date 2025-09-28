import Inheritance.ColoredRect;
import Inheritance.Triangle;

public class Main {
    public static void main(String[] args) {
        ColoredRect rect = new ColoredRect(10, 20);
        Triangle triag = new Triangle(10, 10, 10);

        rect.showPerimeter();
        triag.showPerimeter();
    }
}
