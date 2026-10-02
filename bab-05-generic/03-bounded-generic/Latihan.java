import java.util.ArrayList;
import java.util.List;

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
}

class Latihan {

    static void printAnimal(List<? extends Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
    }

    public static void main(String[] args){
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();

        cats.add(new Cat("kucing a"));
        cats.add(new Cat("kucing b"));

        dogs.add(new Dog("Anjing a"));
        dogs.add(new Dog("Anjing b"));

        System.out.println("Kelompok kucing : ");
        printAnimal(cats);
        
        System.out.println("Kelompok Anjing : ");
        printAnimal(dogs);

    }
}
