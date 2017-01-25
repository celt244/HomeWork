public class Main {

    public static void main(String[] args) {

        NaturalLight[] naturalLight = {
                new Fire(true),
                new Fire(false),
                new Sun(true)
        };

            for (SourceOfLight n : naturalLight){
                n.turnOn();
                n.show();
                n.temperature();
            }

            ArtificialLight[] art = {
                    new Flashlight(),
                    new Flashlight(),
                    new TableLamp(),
                    new TableLamp(),
                    new Flashlight(),
                    new Flashlight(),
                    new Flashlight(),
                    new Flashlight()
            };

            for (ArtificialLight a : art) {
                a.turnOn();
                a.show();
                a.temperature();
            }

            Lamp lamp = new Lamp();
        System.out.println(lamp.getQuantity() - 1);




    }
}
