package Examples;

public class Monster {
    public int eyes;
    public int legs;
    public int arms;

    public Monster(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    public Monster(int count) {
        this(count, count, count);
    }

    public Monster() {
        this(2);
    }

    public void voice() {
        voice(1);
    }

    public void voice(int count) {
        voice(1, "Grrrrrrrrr...");
    }

    public void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
