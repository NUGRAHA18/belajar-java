import java.util.ArrayList;
import java.util.List;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Food extends Product {
    Food(String name) {
        super(name);
    }
}

class Electronic extends Product {
    Electronic(String name) {
        super(name);
    }
}

class Main{
    static void printProducts(List<? extends Product> products){
        for(Product product : products){
            System.out.println(product.name);
        }
    }

    public static void main(String[] args){
        List<Food> foods = new ArrayList<>();

        foods.add(new Food("Nasi goreng"));
        foods.add(new Food("Bakwan Jembak"));

        List<Electronic> electronics = new ArrayList<>();
        
        electronics.add(new Electronic("Laptop"));
        electronics.add(new Electronic("Keyboard"));

        System.out.println("Foods : "); 
        printProducts(foods);
        
        System.out.println("Electronic : "); 
        printProducts(electronics);
    }

}