public class Main {

    public static void main(String[] args) {

Plane[] plane = {
        new Airbus(73, 1020, 15_200, 248_000, 2050, 30, Model.LIGHT),
        new Airbus(78, 1020, 17_200, 260_000, 2050, 32, Model.UPGRADE),
        new Boeing(71, 955, 9800, 183_380, 2000, 29, Model.LIGHT),
        new Boeing(72, 920, 12_000, 200_000, 2000, 30, Model.STANDARD),
        new Boeing(74, 1005, 14_230, 231_310, 2000, 32, Model.UPGRADE),
        new ANMriya(84, 900, 4_000, 300_000, 2300, 650, Model.UPGRADE),
        new Lockheed(75, 919, 5_500, 260_000, 2300, 350_000, Model.STANDARD),
        new Lockheed(75, 930, 7_500, 265_000, 2300, 370_000, Model.UPGRADE),
        new MartinF35(16, 1700, 2200, 8278, 150, true, 3000),
        new MartinF35(16, 1700, 2520, 8960, 130, true, 3500),
        new NighthawkF117(21, 993, 1720, 5500, 1000, false, 2100),
        new NighthawkF117(21, 1200, 1900, 6000, 850, false, 2400)
};

        Airline airlines = new Airline(plane);

        System.out.println(airlines.maxNumberPassenger());
        System.out.println(airlines.maxNumberContainers());


    }
}
