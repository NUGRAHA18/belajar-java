import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input angka
            System.out.print("1. Input angka pertama : ");
            int input1 = scanner.nextInt();

            System.out.print("2. Input angka kedua   : ");
            int input2 = scanner.nextInt();

            // Pembagian
            int hasil = input1 / input2;
            System.out.println("Hasil pembagian : " + hasil);

            // Contoh pemanggilan method withdraw
            withdraw(10, 15);

        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi dengan 0");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program Berakhir");
            scanner.close(); // tutup scanner
        }
    }

    static void withdraw(double balance, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Jumlah penarikan harus lebih dari 0");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Jumlah penarikan melebihi saldo Anda");
        }

        // Jika lolos validasi
        System.out.println("Penarikan berhasil. Sisa saldo: " + (balance - amount));
    }
}