import java.util.Comparator;

public class HomeHouseNumberComparator implements Comparator<Home> {


    @Override
    public int compare(Home o1, Home o2) {
        int res;
        res = o1.getHouseNumber() - o2.getHouseNumber();
        if(res != 0 && o1.getStreet() != o2.getStreet() && o1.getCity() != o2.getCity()) return res;
        return res;
    }
}
