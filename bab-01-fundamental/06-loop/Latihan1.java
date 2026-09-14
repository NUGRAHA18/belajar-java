public class Latihan1 {
    
    public static int calculateDiscount(int price, int discount){
        int resultDiscount = (int) (price * discount / 100);
        int result = price - resultDiscount;  
        System.out.println("Harga awal : " + price);
        System.out.println("Diskon : " + discount + "%");
        System.out.println("Harga Akhir : " + result);

        return result;
    }

    public static void main(String[] args){
        calculateDiscount(800000, 10);
    }
}
