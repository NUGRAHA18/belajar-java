public class Main {
    public static void main(String[] args) {
        //produk 1
        Product product1 = new Product("pensil", 80000);
        product1.showInfo();

        //produk 2
        Product product2 = new Product("mouse", 150000);
        product2.showInfo();
    }
}

class Product {
        String name;
        int price;

        Product(String name, int price){
            this.name = name;
            this.price = price;
        }

        void showInfo(){
            System.out.println(
                name + " - Rp" + price
            );
        }
    }