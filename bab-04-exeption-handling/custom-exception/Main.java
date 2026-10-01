public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100000);

        try {

            account.withdraw(200000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}