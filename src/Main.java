import Inheritance.Cat;
import Inheritance.Lion;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cat cat = new Cat();

        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
    }
}
