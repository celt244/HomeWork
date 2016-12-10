public class Mammal extends Animal {

    public Mammal() {
    }

    public Mammal(boolean vegetarian, String eats, int noOflegs) {

        super(vegetarian, eats, noOflegs);
    }

    public Mammal(String eats, int noOflegs) {
        super(eats, noOflegs);
    }
}