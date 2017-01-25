public class Lamp extends ArtificialLight {


public static int counter;

      public Lamp() {
          counter++;
    }


    public int getQuantity(){
        return counter;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void temperature() {
        super.temperature();
    }
}
