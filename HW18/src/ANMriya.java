
public class ANMriya extends Cargo {

    public ANMriya(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff, int takeoffWeight, Model model) {
        super(length, maxSpeed, distanceMaximumLoad, fuelStock, lengthTakeoff, takeoffWeight, model);
    }

    @Override
    public int getMaxNumberContainers(Model model) {
        switch (getModel()){
            case UPGRADE:
                return 100;
            case STANDARD:
                return 95;
            default:
                return 84;
        }
    }
}
