package Classes;

public class Dog {
    public String name;
    public String breed;
    public double weight;
    public int speed;

    public String getInfo() {
        return String.format("Name: %s, Breed: %s, Weight: %.1f", name, breed, weight);
    }

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }
}
