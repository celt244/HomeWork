import java.util.Comparator;

public class HomeStreetComparator implements Comparator<Home> {


    @Override
    public int compare(Home o1, Home o2) {
        int res;
        res = o1.getStreet().compareTo(o2.getStreet());
        if(res != 0 && o1.getHouseNumber() != o2.getHouseNumber()) return res;
        return res;
    }
}
