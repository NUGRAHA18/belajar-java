public class Main {
    public static void main(String[] args) {
        
        byte tipeByte = 125;
        short tipeShort = 32000;
        int tipeInt = 2147483647;
        long tipeLong = 9223372036854775807L;
        
        float tipeFloat = 3.14f;
        double tipeDouble = 3.141592653;
        
        char tipeChar = 'A';
        
        boolean tipeBoolean = true;

        String tipeString = "Halo Dunia!"; 
        
        int[] tipeArray = {10, 20, 30, 40, 50}; 
        
        System.out.println("--- PRIMITIVE DATA TYPES ---");
        System.out.println("Byte    : " + tipeByte);
        System.out.println("Short   : " + tipeShort);
        System.out.println("Int     : " + tipeInt);
        System.out.println("Long    : " + tipeLong);
        System.out.println("Float   : " + tipeFloat);
        System.out.println("Double  : " + tipeDouble);
        System.out.println("Char    : " + tipeChar);
        System.out.println("Boolean : " + tipeBoolean);
        
        System.out.println("\n--- NON-PRIMITIVE DATA TYPES ---");
        System.out.println("String  : " + tipeString);
        System.out.println("Array   : Indeks ke-0 adalah " + tipeArray[0]);
    }
}