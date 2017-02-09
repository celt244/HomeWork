import java.util.*;

public class Main {

    public static void main(String[] args) {

       Comparator<Home> hcomp;
       hcomp = new HomeStreetComparator().thenComparing(new HomeHouseNumberComparator()).thenComparing(new HomeOccupantsComparator());

        Set<Home> home = new HashSet<>();
        home.add(new Home(27, "Mazepy", "Lviv", 9, 14));
        home.add(new Home(13, "Hmelnytskogo", "Ternopil", 4, 63));
        home.add(new Home(56, "Robocha", "Dnepr", 14, 128));
        home.add(new Home(145, "Shevchenko", "Dnepr", 9, 101));
        home.add(new Home(74, "Doroshenka", "Poltava", 2, 14));
        home.add(new Home(27, "Mazepy", "Bahmut", 7, 56));
        home.add(new Home(58, "Hmelnytskogo", "Vinnytsa", 8, 84));
        home.add(new Home(27, "Franka", "Dnepr", 9, 157));
        home.add(new Home(18, "Yasna", "Sumy", 5, 14));
        home.add(new Home(87, "Hmelnytskogo", "Dnepr", 3, 24));

        System.out.println();

//        for(Home s : home)
//            System.out.println(s.getStreet() + " " + s.getHouseNumber() + " " + s.getOccupants());

        Set<Home> homeLinkedHashSet = new LinkedHashSet<>();
        homeLinkedHashSet.add(new Home(27, "Kamenskaya", "Lviv", 1, 4));
        homeLinkedHashSet.add(new Home(13, "Hmelnytskogo", "Ternopil", 4, 63));
        homeLinkedHashSet.add(new Home(56, "Robocha", "Dnepr", 14, 128));
        homeLinkedHashSet.add(new Home(145, "Shevchenko", "Zaporizhzhya", 9, 101));
        homeLinkedHashSet.add(new Home(74, "Doroshenka", "Poltava", 2, 14));
        homeLinkedHashSet.add(new Home(27, "Mazepy", "Bahmut", 7, 56));
        homeLinkedHashSet.add(new Home(58, "Hmelnytskogo", "Vinnytsa", 8, 84));
        homeLinkedHashSet.add(new Home(46, "Franka", "Mariupol", 9, 157));
        homeLinkedHashSet.add(new Home(18, "Yasna", "Sumy", 5, 14));
        homeLinkedHashSet.add(new Home(87, "Persha", "Dnepr", 3, 24));

        System.out.println();


    Set<Home> homeTreeSet = new TreeSet<>(hcomp);
        homeTreeSet.add(new Home(27, "Kamenskaya", "Lviv", 1, 4));
        homeTreeSet.add(new Home(13, "Hmelnytskogo", "Ternopil", 4, 63));
        homeTreeSet.add(new Home(56, "Robocha", "Dnepr", 14, 128));
        homeTreeSet.add(new Home(145, "Shevchenko", "Zaporizhzhya", 9, 101));
        homeTreeSet.add(new Home(74, "Doroshenka", "Poltava", 2, 14));
        homeTreeSet.add(new Home(27, "Mazepy", "Bahmut", 7, 56));
        homeTreeSet.add(new Home(58, "Hmelnytskogo", "Vinnytsa", 8, 84));
        homeTreeSet.add(new Home(46, "Franka", "Mariupol", 9, 157));
        homeTreeSet.add(new Home(18, "Yasna", "Sumy", 5, 14));
        homeTreeSet.add(new Home(87, "Persha", "Dnepr", 3, 24));

        System.out.println(homeTreeSet.size());
        System.out.println(homeTreeSet);


    }
}
