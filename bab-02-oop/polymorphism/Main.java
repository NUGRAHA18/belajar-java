public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle();
        vehicle1.move();

        Vehicle vehicle2 = new Car();
        vehicle2.move();
    }
}

class Vehicle{
    void move(){
        System.out.println("Kendaraan sedang bergerak.");
    }
}

class Car extends Vehicle{
    @Override 
    void move(){
        System.out.println("Mobil sedang melaju di jalan.");
    }
}

class Motorcycle extends Vehicle{
    @Override 
    void move(){
        System.out.println("Motor sedang melaju di jalan.");
    }
}