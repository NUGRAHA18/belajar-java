public class Main{
    public static void main(String[] args){
        String[] products = {
            "Laptop",
            "Mouse",
            "Keyboard",
            "Monitor"
        };

        int[] prices = {
            8000000,
            150000,
            500000,
            2000000
        };
        
        int total = 0;
        int higherPrices = prices[0];
        for(int i= 0; i<products.length; i++){
            if(higherPrices < prices[i]){
                higherPrices = prices[i];
            }
            total += prices[i];
            System.out.println("Product " + (i+1) + " : " + products[i] + " - " + prices[i]);
        }
        
        System.out.println("Harga tertinggi : " + higherPrices);
        System.out.println("Total : Rp " + total);
    }
}