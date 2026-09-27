import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        Map<String, String> user = new HashMap<>();

        user.put("name", "agung");
        user.put("role", "operator");
        System.out.println(user.get("role")); // ngambil value
        System.out.println(user.put("role", "Admin")); //ubah value
        System.out.println(user.containsKey("name")); //ngecek key
        user.remove("role"); //ngapus data

        //LATIHAN 
        Map<String, String> user1 = new HashMap<>();
        user1.put("Username", "Agung");
        user1.put("Email", "agung@gmail.com");
        user1.put("Role", "admin");

        user1.put("Role", "user");
        System.out.println(user1);

        for(Map.Entry<String, String> entry : user1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}