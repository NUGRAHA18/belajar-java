abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle{
    
    @Override
    void move(){
        System.out.println("Mobil melaju");
    }
}

class Motorcyle extends Vehicle{
    @Override 
    void move(){
        System.out.println("Motor melaju");
    }
}

public class Main{
    public static void main(String[] args){
        Vehicle mobil = new Car();
        Vehicle motor = new Motorcyle();

        mobil.move();
        motor.move();
    }
}