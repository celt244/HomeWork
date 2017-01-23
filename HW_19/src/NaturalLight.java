
public abstract class NaturalLight implements SourceOfLight{

    boolean isDay;
    boolean isBurn;
    String sourceName;
    String action;

    public NaturalLight(boolean isDay, String sourceName, String action) {
        this.isDay = isDay;
        this.sourceName = sourceName;
        this.action = action;
    }

    public NaturalLight(boolean isBurn) {
        this.isBurn = isBurn;
    }

    @Override
    public void turnOn() {
        System.out.println("Shines");
    }

    @Override
    public void show() {

    }

    @Override
    public void temperature() {

    }
}
