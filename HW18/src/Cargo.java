
public class Cargo extends Plane {

    private int takeoffWeight;
    private Model model;

    public Cargo(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, int takeoffWeight, Model model) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff);
        this.takeoffWeight = takeoffWeight;
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public int getMaxNumberPassenger() {
        return 0;
    }

    @Override
    public int getMaxNumberContainers() {
        return 0;
    }
}
