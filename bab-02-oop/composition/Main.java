class Engine{
    void start(){
        System.out.println("Engine Menyala");
    }

    void stop() {
        System.out.println("Engine Mati");
    }
}

// has a class Engine
class Car{
    private Engine engine;

    Car(){
        engine = new Engine();
    }

    void startCar(){
        engine.start();
        System.out.print("Mobil berjalan");
    }

    void stopCar(){
        engine.stop();
        System.out.println("Mobil berhenti");
    }
}

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startCar();
        car2.stopCar();
    }
}
