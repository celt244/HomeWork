import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

            Student student1 = new Student("Ron", "Weasley", 24, Faculty.GRYFFINDOR, Lang.EN);
            Student student2 = new RuStudent("Ron", "Weasley", 24, Faculty.GRYFFINDOR, Lang.RU);
        System.out.println(student2);

        Random random = new Random();

        Student student3 = new Student("John", "Doe", 24, Faculty.values(random.nextInt(Arrays.toString())), Lang.EN);
        System.out.println(student3);


    }
}
