public class Main {

    public static void main(String[] args) {

        Puppy puppy1 = new Puppy("Шарик");
        Puppy puppy2 = new Puppy("Тобик");

        System.out.println(puppy1.toString());
        System.out.println(puppy1.name + " ко мне!");
        puppy1.toRun();
        System.out.println(puppy1.name + " прыгать!");
        puppy1.toJump();
        System.out.println(puppy1.name + " голос");
        puppy1.toBark();
        System.out.println(puppy1.name + " взять мячик");
        puppy1.toBite();

        System.out.println(puppy1.equals(puppy2));
        System.out.println(puppy1.hashCode());
        System.out.println(puppy2.hashCode());

    }
}
