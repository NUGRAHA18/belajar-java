public class Latihan {
    public static void main(String[] args) {
        int hargaLaptop = 8000000;
        double persentaseDiskon = 0.10;
        int resultDiskon = (int) (hargaLaptop * persentaseDiskon);
        int result = hargaLaptop - resultDiskon;  
        System.out.println("Harga awal : " + hargaLaptop);
        System.out.println("Diskon : " + resultDiskon);
        System.out.println("Harga Akhir : " + result);
    }    
}
