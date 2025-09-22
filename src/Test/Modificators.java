package Test;

import Examples.NewPerson;

public class Modificators {
    public static void main(String[] args) {
        NewPerson person = new NewPerson("John", 25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
