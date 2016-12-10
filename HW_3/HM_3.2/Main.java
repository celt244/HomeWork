
public class Main {

    public  static void main (String[] args){

        Shark hamer = new Shark(true,"тюлень",0, "океан");
        Shark hamer3 = new Shark("море");
        Shark hammer4 = new Shark(true);

        Eagle hawk = new Eagle(true, "мыши", 2, 50);

        Сow korova = new Сow(false, "трава", 4, true);
        Сow korova2 = new Сow("сено", 4);


        System.out.println("Сведени об акуле hamer");
        System.out.print("Тип питания: ");
        System.out.println(hamer.isVegetarian() ? "Хищник" : "Травоядное");
        System.out.println("Объект питания: " + hamer.getEats());
        System.out.println("Количество конечностей: " + hamer.noOflegs);
        System.out.println("Среда обитани: " + hamer.habitat);
        System.out.println();

        System.out.println("Сведени об акуле hamer3:");
        System.out.print("Тип питания: ");
        System.out.println(hamer3.isVegetarian() ? "Хищник" : "Травоядное");
        System.out.println("Объект питания: " + hamer3.getEats());
        System.out.println("Количество конечностей: " + hamer3.noOflegs);
        System.out.println("Среда обитани: " + hamer3.habitat);
        System.out.println();

        System.out.println("Сведени об акуле hammer4:");
        System.out.print("Тип питания: ");
        System.out.println(hammer4.isVegetarian() ? "Хищник" : "Травоядное");
        System.out.println("Объект питания: " + hammer4.getEats());
        System.out.println("Количество конечностей: " + hammer4.noOflegs);
        System.out.println("Среда обитани: " + hammer4.habitat);
        System.out.println();


        System.out.println("Сведени об орле hawk: ");
        System.out.print("Тип питания: ");
        System.out.println(hawk.isVegetarian() ? "Хищник" : "Травоядное");
        System.out.println("Объект питания: " + hawk.getEats());
        System.out.println("Количество конечностей: " + hawk.noOflegs);
        System.out.println("Размах крыла: " + hawk.wingspan + " см");
        System.out.println();


        System.out.println("Сведени о корове korova: ");
        System.out.print("Тип питани: ");
        System.out.println(korova.isVegetarian() ? "Хищник" : "Травоядное");
        System.out.println("Объект питания: " + korova.getEats());
        System.out.println("Количество конечностей: " + korova.noOflegs);
        System.out.println("Наличие копыт: " + korova.hoof);
        System.out.println();

        System.out.println("Сведени о корове korova2: ");
        System.out.print("Тип питани: ");
        System.out.println(korova2.isVegetarian() ? "Хищник" : "Травоядное");
        System.out.println("Объект питания: " + korova2.getEats());
        System.out.println("Количество конечностей: " + korova2.noOflegs);
        System.out.println("Наличие копыт: " + korova2.hoof);

    }
}
