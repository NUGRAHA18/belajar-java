public class Main {
    public static void main(){
            for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        genap();
    }    

    public static void genap(){
        for(int i = 0; i<=10; i++){
            if(i <= 2){
                System.out.println(i);
                continue;
            }
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
