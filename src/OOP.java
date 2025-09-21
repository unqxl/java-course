import Classes.Box;
import Classes.Dog;
import Classes.Employee;
import Classes.Monster;
import Classes.Person;
import Classes.Rect;
import Classes.Test;

public class OOP {
    public static void main(String[] args) {
        // Box box1 = new Box(10, 10, 10);
        // Box box2 = new Box(20, 20, 20);

        // box1.showVolume();
        // box2.showVolume();

        // Dog dog = new Dog();
        // dog.name = "Тузик";
        // dog.breed = "Такса";
        // dog.weight = 4;
        // dog.speed = 10;
        // dog.run();
        // System.out.println(dog.getInfo());

        // Rect rect = new Rect();
        // rect.setDimensions(10, 5);
        
        // double area = rect.getArea();
        // System.out.printf("• area = %.1f \n", area);

        // Employee employee = new Employee("John", "Director", 100000);
        // employee.showInfo();

        // Box box = new Box(30);
        // box.showVolume();

        Monster monster = new Monster(5);
        monster.voice(10, "Aaa");
    }
}

