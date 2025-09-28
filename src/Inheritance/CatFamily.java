package Inheritance;

public class CatFamily {
    protected boolean canEatPerson;
    protected int legs;
    protected int eyes;

    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
        this.legs = legs;
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }

    public int getLegs() {
        return this.legs;
    }

    public int getEyes() {
        return this.eyes;
    }

    public boolean isCanEatPerson() {
        return this.canEatPerson;
    }
}
