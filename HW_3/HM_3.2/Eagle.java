public class Eagle extends Bird {

    public double wingspan;

    private Eagle() {
    }

    public Eagle(boolean vegetarian, String eats, int noOflegs, double wingspan) {
        super(vegetarian, eats, noOflegs);
        this.wingspan = wingspan;

    }


}
