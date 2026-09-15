
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Nama Pemilik Akun : ");
        String namaPemilik = scanner.nextLine();

        System.out.print("Masukkan Saldo Awal: ");
        double saldoInput = scanner.nextDouble();
        
        System.out.println("\n--- REKENING BERHASIL DIBUAT ---");
        BankAccount owner1 = new BankAccount(namaPemilik, saldoInput);
        owner1.getBalance();
        owner1.deposit(20);
        owner1.deposit(100);
        owner1.withdraw(50);

        scanner.close();
    }    
}

class BankAccount{
    private String owner;
    private double balance;

    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    void getBalance(){
        System.out.println("Saldo anda " + balance);
    }

    void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Transaksi Suksess. Balance : " + balance);
        }else {
            System.out.println("something wrong");
        }
    }

    void withdraw(double amount){
        if(amount > 9 && amount < balance){
            balance -= amount;
            System.out.println("Tarik tunai sukses, saldo anda : " + balance);
        }else {
            System.out.println("Something wrong.");
        }
    }
}

