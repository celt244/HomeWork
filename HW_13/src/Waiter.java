public class Waiter extends Employee {

    Order[] orders;
    private int tip = 0;

    public Waiter(String name, int age) {
        super(name, age);
    }

    public  void takeOrder(Order order){
        for(int i = 0; i < orders.length && orders[i] == null; i++)
            orders[i] = order;
}

    public void setOrderTitle(int i, String nameDrink, int numDrink){
            orders[i].setTitle(nameDrink, numDrink);
    }

    public int takeTips(int a){
        return tip += a;
    }

}
