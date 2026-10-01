import java.util.List;
import java.util.stream.Collectors;
class Main{
    public static void main(String[] args){
        List<Integer> prices = List.of(
            8000000,
            150000,
            500000,
            2000000,
            750000
        );

        // System.out.println("Harga diata 50000");
        // prices.stream()
        // .filter(price -> price > 50000)
        // .forEach(price -> System.out.println(price));

        // System.out.println("Kurangi harga sebanyak 50000");
        // prices.stream().map(price -> price-5000).forEach(price -> System.out.println(price));

        System.out.println("Harga lebih besar dari 50000 ditambah 50%");
        List<Integer> updatePrices = prices.stream().filter(price -> price > 50000).map(price -> price +(price * 50)/100).collect(Collectors.toList());
        System.out.println(updatePrices);   
    }
}