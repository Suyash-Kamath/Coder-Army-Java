/*
Implementing Runtime Polymorphism

Method Overriding
*/

package code.polymorphism;

public class DynamicPolimorphism {
    public static void main(String[] args) {

        // Runtime polymorphism in action
        // Same reference type, different objects
        // Decision of which run() to call is made at RUNTIME

        Animal animal;

        animal = new Dog();
        animal.run();
        animal.eat();

        System.out.println("---");

        animal = new Duck();
        animal.run();
        animal.eat();

        System.out.println("---");

        animal = new Human();
        animal.run();
        animal.eat();

        System.out.println("---");

        // Storing different types in one array
        // This is the real power of runtime polymorphism
        Animal[] animals = {
            new Dog(),
            new Duck(),
            new Human()
        };

        for (Animal a : animals) {
            a.run(); // Each calls its own run() — decided at runtime
        }
    }
}

abstract class Animal {

    // Abstract method — WHAT is declared, HOW is left to subclasses
    abstract void run();

    // Common method — same for all animals
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void run() {
        System.out.println("Dog is running on four legs at high speed");
    }
}

class Duck extends Animal {

    @Override
    void run() {
        System.out.println("Duck is waddling awkwardly");
    }
}

class Human extends Animal {

    @Override
    void run() {
        System.out.println("Human is running on two legs");
    }
}