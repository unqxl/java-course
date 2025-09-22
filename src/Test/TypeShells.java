package Test;

import Examples.NewPerson;

public class TypeShells {
    public static void main(String[] args) {
        String str = "This is John. He is 27 y.o";
        String name = str.substring(8, 12);

        String ageString = str.substring(20, 22);
        int age = Integer.parseInt(ageString);

        NewPerson person = new NewPerson(name, age);
        System.out.println(person.getName() + " " + person.getAge());
    }
}
