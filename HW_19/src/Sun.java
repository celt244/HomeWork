
public class Sun extends NaturalLight{

    public Sun(boolean isDay) {
        super(isDay, "Sun", isDay ? "is shining" : "is not shining");
    }

    @Override
    public void temperature() {
        System.out.println("1_000_000_000  degrees Celsius");
    }
}
