
public class Military extends Plane {

    private boolean verticalTakeoffAndLanding;
    private int rateOfFire;


    public Military(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, boolean verticalTakeoffAndLanding, int rateOfFire) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff);
        this.verticalTakeoffAndLanding = verticalTakeoffAndLanding;
        this.rateOfFire = rateOfFire;
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
