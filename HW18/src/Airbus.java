
public class Airbus extends Passenger {


    public Airbus(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, int wheelBase, Model model) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff, wheelBase, model);
    }

@Override
    public int getMaxNumberPassenger(Model model) {
        switch (getModel()){
            case UPGRADE:
                return 510;
            case STANDARD:
                return 490;
            default:
                return 480;
        }
    }

}
