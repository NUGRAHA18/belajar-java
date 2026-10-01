// T adalah simbol untuk tipe data yang akan ditentukan nanti
//Generic membutuhkan reference type/object, bukan primitive
class Main{
    public static void main(String[] args){
        printData("Agung");
        printData(22);
        printData(75.5);
        printData(true);

        String name = getData("Agung");
        Integer age = getData(22);
        Double score = getData(95.5);

        Integer price = 8000000;
        int priceInt = price;
        Double discount = 800000.0;
        double discountDouble = discount;
        Boolean available = true;
    }

    static <T> void printData(T data) {
        System.out.println(data);
    }

    static <T> T getData(T data) {
    return data;
}
}