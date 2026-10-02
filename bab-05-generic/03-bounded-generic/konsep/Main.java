import java.util.ArrayList;
import java.util.List;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}

public class Main {

    // ? extends Animal → membaca data
    static void printAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {
            System.out.println("Hewan: " + animal.name);
        }
    }

    // ? super Cat → memasukkan Cat
    static void addCat(List<? super Cat> animals) {

        animals.add(new Cat("Miko"));
        animals.add(new Cat("Oyen"));
    }

    public static void main(String[] args) {

        // =========================
        // EXTENDS
        // =========================

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Milo"));
        cats.add(new Cat("Coco"));

        System.out.println("=== EXTENDS ===");

        printAnimals(cats);


        // =========================
        // SUPER
        // =========================

        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Bobi"));
        System.out.println(animals);

        addCat(animals);

        System.out.println("\n=== SUPER ===");

        printAnimals(animals);
    }
}