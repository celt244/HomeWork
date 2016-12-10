public class Moon {

    public String moon1 = "Луна";
    public String moon2 = "Фобас";

    @Override
    public String toString() {
        return "Moon{" +
                "Спутник ='" + moon1 + '\'' +
                ", второй Спутник ='" + moon2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moon moon = (Moon) o;

        if (moon1 != null ? !moon1.equals(moon.moon1) : moon.moon1 != null) return false;
        return moon2 != null ? moon2.equals(moon.moon2) : moon.moon2 == null;

    }

    @Override
    public int hashCode() {
        int result;
        result = 31 * moon1.hashCode() + 15 * moon2.hashCode();
        return result;
    }
}
