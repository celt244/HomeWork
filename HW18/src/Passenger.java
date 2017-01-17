
public class Passenger extends Plane {

    private int wheelBase;
    private Model model;

    public Passenger(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, int wheelBase, Model model) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff);
        this.wheelBase = wheelBase;
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
