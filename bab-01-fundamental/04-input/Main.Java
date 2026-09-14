import java.util.Scanner;
public class Main{
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        
        System.out.print("Masukkan harga : ");
        int hargaLaptop = scanner.nextInt();
      
        System.out.print("Masukkan harga diskon : ");
        double persentaseDiskon = scanner.nextDouble();

        int resultDiskon = (int) (hargaLaptop * persentaseDiskon);
        int result = hargaLaptop - resultDiskon;  
        System.out.println("Nama : " + name);
        System.out.println("Harga awal : " + hargaLaptop);
        System.out.println("Diskon : " + resultDiskon);
        System.out.println("Diskon : " + persentaseDiskon);

        System.out.println("Harga Akhir : " + result);
    }
}


