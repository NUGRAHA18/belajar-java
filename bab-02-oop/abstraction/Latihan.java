abstract class Payment{
    abstract void pay(double amount);
}

class CashPayment extends Payment{
    @Override 
    void pay(double amount){
        System.out.println("Membayar Rp " + amount +" menggunakan Cash.");
    }
}

class EWalletPayment extends Payment{
    @Override
    void pay(double amount){
         System.out.println("Membayar Rp " + amount +" menggunakan E-Wallet.");
    }
}

public class Latihan{
    public static void main(String[] args){
        Payment pay1 = new CashPayment();
        Payment pay2 = new EWalletPayment();
        pay1.pay(5000);
    }
}