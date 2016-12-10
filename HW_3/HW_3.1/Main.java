public class Main {
    public static void main (String[] args){

    Account account1 = new Account();
    Account account2 = new Account(2);
    Account account3 = new Account(4,2);

        System.out.println(account1.getAmount());
        System.out.println(account1.getId());
        System.out.println(account2.getAmount());
        System.out.println(account2.getId());
        System.out.println(account3.getAmount());
        System.out.println(account3.getId());

    }
}
