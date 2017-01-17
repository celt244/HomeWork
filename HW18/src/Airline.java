import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Airline {

    private Plane[] planes;


    public Airline(Plane[] planes) {
        this.planes = planes;
    }

    public int maxNumberPassenger() {
        int totalPassenger = 0;
        for(Plane p : planes){
            totalPassenger += p.getMaxNumberPassenger();
        }
        return totalPassenger;
    }

    public int maxNumberContainers() {
        int totalContainers = 0;

        for(Plane p : planes){
            totalContainers += p.getMaxNumberContainers();
        }
        return totalContainers;
    }


    // метод сортировки самолетов компании по дальности полета
    public Plane[] sortByMaxDistance(){
        Plane[] res = new Plane[planes.length];
        System.arraycopy(planes, 0, res, 0, planes.length);
        Arrays.sort(res, getComparator());
        return res;
    }

    public Comparator<Plane> getComparator() {
        return (c1, c2) -> Integer.compare(c1.getDistanceMaximumLoad(), c2.getDistanceMaximumLoad());
    }

    // поиска самолетов по заданному диапазону параметров расхода топлива
    public int getByFuelStock(int from, int to) {
        List<Plane> planeList = new ArrayList<>();
        for (Plane p : planes) {
            if( p.getFuelStock() <= to && p.getFuelStock() >= from)
                planeList.add(p);
        }
        return planeList.toArray(new Plane(1));
    }
}
