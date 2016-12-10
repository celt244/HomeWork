public class Planet {

    public String dopPlanet1 = "Нептун";
    public int dopCount = 1;


    @Override
    public String toString() {
        return "Дополнительные планеты {" +
                "1 - '" + dopPlanet1 + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;

        return dopPlanet1 != null ? dopPlanet1.equals(planet.dopPlanet1) : planet.dopPlanet1 == null;

    }

    @Override
    public int hashCode() {
        int hash;
        hash = 13 * dopPlanet1.hashCode() * 24 + (dopPlanet1 != null ? dopPlanet1.hashCode() : 0);
        return hash;
    }
}
