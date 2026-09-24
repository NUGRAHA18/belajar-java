import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        ArrayList<String> products = new ArrayList<>(List.of("Laptop", "Mouse", "Keyboard")); 
        products.add("Monitor");
        for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i));
        }
        products.remove(1);
         for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i));
        }
    }
}