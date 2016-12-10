public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOflegs;

    public Animal() {
    }

    Animal(boolean vegetarian, String eats, int noOflegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOflegs = noOflegs;
    }

    public Animal(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Animal(String eats, int noOflegs) {

        this.eats = eats;
        this.noOflegs = noOflegs;
    }

    protected boolean isVegetarian() {
        return vegetarian ;
    }

    protected String getEats() {
        return eats;
    }

    protected int getNoOflegs() {
        return noOflegs;
    }
}
