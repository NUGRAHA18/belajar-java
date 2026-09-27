
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Membuat List
        List<String> fruits = new ArrayList<>();

        // ===== 1. add() → Menambah data =====
        fruits.add("Apel");
        fruits.add("Mangga");
        fruits.add("Jeruk");
        fruits.add("Pisang");

        System.out.println("Isi List: " + fruits);
        // Output: [Apel, Mangga, Jeruk, Pisang]


        // ===== 2. add(index, element) → Menambah di posisi tertentu =====
        fruits.add(1, "Anggur");  // masukkan di index 1
        System.out.println("Setelah insert: " + fruits);
        // Output: [Apel, Anggur, Mangga, Jeruk, Pisang]


        // ===== 3. get(index) → Mengambil data berdasarkan index =====
        String buah = fruits.get(2);
        System.out.println("Buah di index 2: " + buah); // Mangga


        // ===== 4. set(index, element) → Mengubah data =====
        fruits.set(3, "Semangka");
        System.out.println("Setelah diubah: " + fruits);
        // Output: [Apel, Anggur, Mangga, Semangka, Pisang]


        // ===== 5. remove() → Menghapus data =====
        fruits.remove("Anggur");          // hapus berdasarkan isi
        fruits.remove(0);                 // hapus berdasarkan index
        System.out.println("Setelah dihapus: " + fruits);


        // ===== 6. size() → Menghitung jumlah data =====
        System.out.println("Jumlah buah: " + fruits.size());


        // ===== 7. contains() → Cek apakah data ada =====
        boolean adaMangga = fruits.contains("Mangga");
        System.out.println("Apakah ada Mangga? " + adaMangga);


        // ===== 8. indexOf() → Mencari posisi data =====
        int posisi = fruits.indexOf("Pisang");
        System.out.println("Posisi Pisang: " + posisi);


        // ===== 9. isEmpty() → Cek apakah list kosong =====
        System.out.println("Apakah kosong? " + fruits.isEmpty());


        // ===== 10. clear() → Menghapus semua data =====
        // fruits.clear();
        // System.out.println("Setelah clear: " + fruits);


        // ===== 11. Looping List =====
        System.out.println("\n=== Looping dengan for-each ===");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        System.out.println("\n=== Looping dengan index ===");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ". " + fruits.get(i));
        }

        //WITH DIFFERENT OBJECT 
        System.out.println("\n=== With different object ===");
        List<Object> dataCampuran = new ArrayList<>();

        dataCampuran.add("Apel");           // String
        dataCampuran.add(100);              // Integer
        dataCampuran.add(3.14);             // Double
        dataCampuran.add(true);             // Boolean
        dataCampuran.add(new Hero("samsudin", 100, 50));
        
        // Menampilkan
        for (Object data : dataCampuran) {
            System.out.println(data + " | tipe: " + data.getClass().getSimpleName());
        }
    }
}