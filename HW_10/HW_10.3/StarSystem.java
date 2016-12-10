public class StarSystem {

    public String namePlanet1 = "Меркурий";
    public String namePlanet2 = "Венера";
    public String namePlanet3 = "Земля";
    public String namePlanet4 = "Марс";
    public String namePlanet5 = "Сатурн";
    public String namePlanet6 = "Юпитер";
    public String namePlanet7 = "Уран";


        String[] arrPlanet = {namePlanet1, namePlanet2, namePlanet3, namePlanet4, namePlanet5, namePlanet6, namePlanet7};
        int countPl = arrPlanet.length;

    @Override
    public String toString() {
        return "Название планет в Звездной системе {" +
                "1 - '" + namePlanet1 + '\'' +
                ", 2 - '" + namePlanet2 + '\'' +
                ", 3 - '" + namePlanet3 + '\'' +
                ", 4 - '" + namePlanet4 + '\'' +
                ", 5 - '" + namePlanet5 + '\'' +
                ", 6 - '" + namePlanet6 + '\'' +
                ", 7 - '" + namePlanet7 + '\'' +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StarSystem that = (StarSystem) o;

        if (namePlanet1 != null ? !namePlanet1.equals(that.namePlanet1) : that.namePlanet1 != null) return false;
        if (namePlanet2 != null ? !namePlanet2.equals(that.namePlanet2) : that.namePlanet2 != null) return false;
        if (namePlanet3 != null ? !namePlanet3.equals(that.namePlanet3) : that.namePlanet3 != null) return false;
        if (namePlanet4 != null ? !namePlanet4.equals(that.namePlanet4) : that.namePlanet4 != null) return false;
        if (namePlanet5 != null ? !namePlanet5.equals(that.namePlanet5) : that.namePlanet5 != null) return false;
        if (namePlanet6 != null ? !namePlanet6.equals(that.namePlanet6) : that.namePlanet6 != null) return false;
        return namePlanet7 != null ? namePlanet7.equals(that.namePlanet7) : that.namePlanet7 == null;

    }

    @Override
    public int hashCode() {
        int result = namePlanet1 != null ? namePlanet1.hashCode() : 0;
        result = 103 * result + namePlanet1.hashCode();
        result = 31 * result + (namePlanet7 != null ? namePlanet7.hashCode() : 0) + 18;
        return result;
    }
}
