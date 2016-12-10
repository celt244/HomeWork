public class Сow extends Mammal {


    public boolean hoof;

    private Сow() {

    }

    public Сow(String eats, int noOflegs) {
        super(eats, noOflegs);
    }

    public Сow(boolean vegetarian, String eats, int noOflegs, boolean hoof) {
        super(vegetarian, eats, noOflegs);
        this.hoof = hoof;
    }
}