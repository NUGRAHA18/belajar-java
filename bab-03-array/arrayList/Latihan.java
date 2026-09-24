import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> prices = new ArrayList<>();

        prices.add(8000000);
        prices.add(150000);
        prices.add(500000);
        prices.add(2000000);

        System.out.println("=== WELCOME TO PROGRAM ===");

        printPrices(prices);

        int total = calculateTotal(prices);
        System.out.println("Total harga : " + total);

        int highestPrice = findHighestPrice(prices);
        System.out.println("Harga tertinggi : " + highestPrice);

        removePrice(prices, 1);

        System.out.println("List setelah remove:");
        printPrices(prices);
    }

    // Hanya menampilkan data
    static void printPrices(List<Integer> prices) {

        System.out.println("\nList harga:");

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
    }

    // Menghitung total dan mengembalikan hasil
    static int calculateTotal(List<Integer> prices) {

        int total = 0;

        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i);
        }

        return total;
    }

    // Mencari harga tertinggi dan mengembalikan hasil
    static int findHighestPrice(List<Integer> prices) {

        int highestPrice = prices.get(0);

        for (int i = 1; i < prices.size(); i++) {

            if (prices.get(i) > highestPrice) {
                highestPrice = prices.get(i);
            }
        }

        return highestPrice;
    }

    // Menghapus harga berdasarkan index
    static void removePrice(List<Integer> prices, int index) {

        prices.remove(index);
    }
}