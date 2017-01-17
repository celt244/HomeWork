
public abstract class Plane {

    private double length;
    private int maxSpeed;
    private int DistanceMaximumLoad;
    private int fuelStock;
    private int lengthTakeoff;

    public Plane(double length, int maxSpeed, int distanceMaximumLoad, int fuelStock, int lengthTakeoff) {
        this.length = length;
        this.maxSpeed = maxSpeed;
        DistanceMaximumLoad = distanceMaximumLoad;
        this.fuelStock = fuelStock;
        this.lengthTakeoff = lengthTakeoff;
    }

    public abstract int getMaxNumberPassenger();

    public abstract int getMaxNumberContainers();

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDistanceMaximumLoad() {
        return DistanceMaximumLoad;
    }

    public void setDistanceMaximumLoad(int distanceMaximumLoad) {
        DistanceMaximumLoad = distanceMaximumLoad;
    }

    public int getFuelStock() {
        return fuelStock;
    }

    public void setFuelStock(int fuelStock) {
        this.fuelStock = fuelStock;
    }

    public int getLengthTakeoff() {
        return lengthTakeoff;
    }

    public void setLengthTakeoff(int lengthTakeoff) {
        this.lengthTakeoff = lengthTakeoff;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "length=" + length +
                ", maxSpeed=" + maxSpeed +
                ", DistanceMaximumLoad=" + DistanceMaximumLoad +
                ", fuelStock=" + fuelStock +
                ", lengthTakeoff=" + lengthTakeoff +
                '}';
    }
}
