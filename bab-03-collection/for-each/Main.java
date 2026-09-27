import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> user1 = new HashMap<>();
        user1.put("nama", "Budi");
        user1.put("email", "budi@email.com");
        user1.put("kota", "Jakarta");

        // Looping
        for(Map.Entry<String, String> entry : user1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}