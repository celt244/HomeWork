
public class Boeing extends Passenger {

    public Boeing(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, int wheelBase, Model model) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff, wheelBase, model);
    }
@Override
    public int getMaxNumberPassenger(Model model) {
        switch (getModel()){
            case UPGRADE:
                return 581;
            case STANDARD:
                return 524;
            default:
                return 452;
        }
    }
}
