import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Planet planet = new Planet();
        StarSystem starSystem = new StarSystem();
        Star star = new Star();

        System.out.println("Количество планет в звездной системе - " + starSystem.countPl);
        System.out.println(star.toString());
        System.out.print("Добавим планету в систему: ");
        System.out.println(starSystem.countPl + planet.dopCount);

    }
}
