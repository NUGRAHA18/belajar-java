public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 10);
        car.showInfo();
        car.honk();
    }
}

class Vehicle{
    String brand;
    int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void showInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }
}

class Car extends Vehicle{
    Car(String brand, int speed){
        super(brand, speed);
    }
    void honk(){
        System.out.println(brand + " Sedang membunyikan klakson");
    }
}