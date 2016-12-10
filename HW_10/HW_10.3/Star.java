public class Star {

    public String strar1 = "Солнце";

    @Override
    public String toString() {
        return "Звезда - " + strar1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Star star = (Star) o;

        return strar1 != null ? strar1.equals(star.strar1) : star.strar1 == null;

    }

    @Override
    public int hashCode() {
        int hash;
        hash = 56 * strar1.hashCode() +12;
        return hash;
    }
}
