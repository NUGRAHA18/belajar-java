import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");

        Iterator<String> iterator = products.iterator();

        //hasNext() = untuk ngecheck value index setelahnya. 
        //Next() = untuk ngambil nilai setelahnya
        while (iterator.hasNext()) {

            String product = iterator.next();

            if (product.equals("Mouse")) {
                iterator.remove();
            }
        }

        for (String product : products) {
            System.out.println(product);
        }
    }
}