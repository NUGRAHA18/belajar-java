import java.util.Scanner;
public class Main{
    public static void main(String[] args){ 
       Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Kamu sudah dewasa.");
        } else {
            System.out.println("Kamu belum dewasa.");
        }

        scanner.close();
    }
}
