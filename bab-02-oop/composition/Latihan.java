class Product{
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    void showProduct(){
        System.out.println("Name Product : " + name);
        System.out.println("Price : " + price);
    }
}

class Payment{
    void pay(double amount){
        System.out.println("Pembayaran sebesar " + amount + " berhasil.");
    }
}

class Order{
    private Product product;
    private Payment payment;

    Order(Product product, Payment payment){
        this.product = product;
        this.payment = payment;
    }

    void checkout(){
        product.showProduct();
        payment.pay(product.price);
    }
}

public class Latihan{
    public static void main(String[] args){
        // PERBAIKAN 2: Buat dulu objek Product dan Payment
        Product product1 = new Product("Mesin", 50000);
        Payment payment1 = new Payment();

        // PERBAIKAN 3: Masukkan objek product1 dan payment1 ke dalam Order
        Order order1 = new Order(product1, payment1);
        order1.checkout();
    }
}