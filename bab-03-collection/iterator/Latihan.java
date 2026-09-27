import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Latihan {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> iterator = numbers.iterator();

        //hasNext() = untuk ngecheck value index setelahnya. 
        //Next() = untuk ngambil nilai setelahnya

        while (iterator.hasNext()) {
            int number = iterator.next();
            if(number < 30){
                iterator.remove();
            }
        }
        System.out.println(numbers);

        // for (String product : numbers) {
        //     System.out.println(product);
        // }
    }
}