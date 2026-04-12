/*
Implementing Compile Time Polymorphism 

Method Overloading technique
*/

package code.polymorphism;

public class StaticPolymorphism {
    public static void main(String[] args) {

        Human human = new Human();

        // Calling overloaded methods
        human.run();
        human.run(true);
        human.run(5);
        human.run("the park");
    }
}

class Human {

    // Version 1 — no parameters, normal situation
    void run() {
        System.out.println("Human is running at 2 km/h — normal pace");
    }

    // Version 2 — boolean parameter, dog is chasing
    void run(boolean isDogBehind) {
        if (isDogBehind) {
            System.out.println("Human is running at 5 km/h — PANIC MODE, dog is chasing!");
        } else {
            System.out.println("Human is running at 2 km/h — normal pace");
        }
    }

    // Version 3 — int parameter, specific speed target
    void run(int targetSpeed) {
        System.out.println("Human is running at " + targetSpeed + " km/h — target speed set");
    }

    // Version 4 — String parameter, specific destination
    void run(String destination) {
        System.out.println("Human is running towards " + destination);
    }
}