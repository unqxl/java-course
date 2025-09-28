import Inheritance.Cat;
import Inheritance.Lion;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cat cat = new Cat();

        cat.eat();
        lion.eat();
    }
}
