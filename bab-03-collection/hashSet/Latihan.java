import java.util.HashSet;
import java.util.Set;

class Latihan{
    public static void main(String[] args){
        Set<String> products = new HashSet<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Laptop");
        products.add("Monitor");

        for(String p:products){
            System.out.println(p);
        }
       
    }
}