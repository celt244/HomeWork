public class Shark extends Fish{

    public String habitat;

    private Shark() {
    }

    public Shark(String habitat) {
        this.habitat = habitat;
    }

    public Shark(boolean vegetarian, String eats, int noOflegs, String habitat) {
        super(vegetarian, eats, noOflegs);
        this.habitat = habitat;
    }

    public Shark(boolean vegetarian) {
        super(vegetarian);
    }
}
