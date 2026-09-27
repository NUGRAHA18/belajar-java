//Hash set tidak menyimpan data duplikat.
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Agung");
        names.add("Budi");
        names.add("Citra");
        names.add("Agung");

        System.out.println(names);
    }
}