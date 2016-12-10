public class Puppy extends Dog{


    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Имя щенка - " + name;
    }

    @Override
    public void toBark() {
        System.out.println("Тяв! Тяв!");
    }

    @Override
    public void toJump() {
        System.out.println("Прыг-прыг");
    }

    @Override
    public void toRun() {
        System.out.println("Тыдых-тыдых-тыдых...");
    }

    @Override
    public void toBite() {
        System.out.println("кусь-кусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Puppy puppy = (Puppy) o;

        return (name != null) ? name.equals(puppy.name) : (puppy.name == null);

    }

    @Override
    public int hashCode() {
        int hash = 45;
        int i = hash * 24 + name.hashCode();
        return i;
    }


}
