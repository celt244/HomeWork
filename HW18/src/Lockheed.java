
public class Lockheed extends Cargo{

    public Lockheed(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, int takeoffWeight, Model model) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff, takeoffWeight, model);
    }

@Override
    public int getMaxNumberContainers(Model model) {
        switch (getModel()){
            case UPGRADE:
                return 75;
            case STANDARD:
                return 68;
            default:
                return 56;
        }
    }
}
