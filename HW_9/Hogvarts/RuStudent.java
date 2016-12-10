
public class RuStudent extends Student{

    public RuStudent(String firstName, String lastName, int age, Faculty Faculty, Lang Lang) {
        super(firstName, lastName, age, Faculty, Lang);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " "+ age + " лет, студент факультета " + Faculty.getNameRU();
    }
}
