import java.util.Scanner;
public class Latihan {    
    public static void main(String[] args){
        char nilaiHuruf;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int nilai = scanner.nextInt();
        scanner.nextLine();

        if (nilai >= 90 && nilai <= 100) {
            nilaiHuruf = 'A';
        } else if (nilai >= 80) {
            nilaiHuruf = 'B'; 
        } else if (nilai >= 70) {
            nilaiHuruf = 'C';
        } else if (nilai >= 60) {
            nilaiHuruf = 'D'; 
        } else {
            nilaiHuruf = 'E';  
        }

        scanner.close();
        System.out.println(nilaiHuruf);
    }
}
