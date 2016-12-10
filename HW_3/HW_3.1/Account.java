public class Account {

    int id;
    double amount;

    public Account(){
    }

    public Account(int id){
        this.id = id;
    }

    public Account(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    String getAmount(){
        return "Сумма : " + amount;
    }
    String getId(){
        return "Номер: " + id;
    }
}
