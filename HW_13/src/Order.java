public class Order {

    private int initialSize;
    private int size = 0;
    private float maxLoad = 0.8f;
    private float minLoad = 0.6f;
    private int[] order;
    String nameDrink;
    int numDrink;

    public Order(String nameDrink, int numDrink){
        this.nameDrink = nameDrink;
        this.numDrink = numDrink;
    }

    public Order(){
        this.initialSize = 10;
        this.order = new int[initialSize];

    }

    public Order(int initialSize){
        this.initialSize = initialSize;
        this.order = new int[initialSize];
    }

    // Увеличиваем размер массива, если заказов больше 10
    public void order(int or){
        float currentLoad = size/(initialSize * 1.0f);
        if (currentLoad > maxLoad)
        {
            initialSize = (int) (size * 1.5f);
            int tmp[] = new int[initialSize];

            for (int i = 0; i < size; i++)
                tmp[i] = order[i];
            order = tmp;
        }
        order[size++] = or;
    }

    // удаление заказа из массива
    public void removeOrder(){
        if(size > 0) {
            order[--size] = 0;
        }
        float currentLoad = size/initialSize;
        if (currentLoad <= minLoad){
            initialSize = (int) (size* 1.5);
            int [] tmp = new int [initialSize];
            for(int i = 0; i < size; i++){
                tmp[i] = order[i];
            }
            order = tmp;
        }
    }
        // присваеваем название напитка и количество в одном заказе
    public void setTitle(String nameDrink, int numDrink){
        this.nameDrink = nameDrink;
        this.numDrink = numDrink;
    }

    public int getTotalOrder(){
        return order.length;
    }


}

