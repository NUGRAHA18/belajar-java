
//Latihan constructor
public class Main {
    //produk 1
    public static void main(String[] args){
        Product product1 = new Product("Pensil",50000,2);
        product1.showInfo();
    }
}

class Product{
    String name;
    int price;
    int stock;

    Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    void showInfo(){
        System.out.println("Product : " + name);
        System.out.println("Price : " + price);
        System.out.println("stock : " + stock);
    }
}



