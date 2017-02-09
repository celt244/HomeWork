public class Home implements Comparable<Home>{

     private int houseNumber;
     private String street;
     private String city;
     private int floors;
     private int occupants;

    public Home(int houseNumber, String street, String city, int floors, int occupants) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.floors = floors;
        this.occupants = occupants;
    }


    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        if (houseNumber != home.houseNumber) return false;
        if (floors != home.floors) return false;
        if (occupants != home.occupants) return false;
        if (street != null ? !street.equals(home.street) : home.street != null) return false;
        return city != null ? city.equals(home.city) : home.city == null;
    }



    @Override
    public int hashCode() {
        int result = houseNumber;
        result = 13 * result + floors + occupants * 4;
        return result;


    }    @Override
    public String toString() {
        return "Home{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", floors=" + floors +
                ", occupants=" + occupants +
                '}';
    }

    @Override
    public int compareTo(Home o) {
        return houseNumber - o.getHouseNumber();
    }
}
