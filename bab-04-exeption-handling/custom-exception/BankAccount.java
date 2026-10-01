public class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    void withdraw(double amout) throws InsufficientBalanceException{
        if(amout > balance){
            throw new InsufficientBalanceException("Saldo tidak cukup");
        }

        balance -= amout;
        System.out.println("Penarikan berhasil");
    }
}