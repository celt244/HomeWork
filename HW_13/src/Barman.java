public class Barman extends Employee {

    Order order = new Order();

    public Barman(String name, int age) {
        super(name, age);
     }

    public void runOrder(String nameDrink, int numDrink){
            while (numDrink > 0)
                numDrink--;
        order.removeOrder();

    }

}
