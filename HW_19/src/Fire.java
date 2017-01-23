
public class Fire extends NaturalLight{

    public Fire(boolean isBurn) {
        super(isBurn, "Fire", isBurn ? "is burning" : "is not burning");

        }

    @Override
    public void turnOn() {
        System.out.println("Arson!!!");
    }

    @Override
    public void temperature() {
        System.out.println("250 degrees Celsius");
    }
}
