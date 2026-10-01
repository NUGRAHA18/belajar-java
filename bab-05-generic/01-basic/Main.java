public class Main{
    public static void main(String[] args){
        Box<String> box1 = new Box<>("Laptop");
        Box<Integer> box2 = new Box<>(100);
        Box<Double> box3 = new Box<>(99.5);
        Box<Boolean> box4 = new Box<>(true);

        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
        System.out.println(box3.getValue());
        System.out.println(box4.getValue());
    }
}
