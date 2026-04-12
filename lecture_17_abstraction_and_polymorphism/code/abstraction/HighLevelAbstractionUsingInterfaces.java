/*
interface ke andhar by default abstract keyword is used internally beside the method 

Interface is like a contract, to represent the contract . means agar apko car ke interface ko implement karna haii toh aapko kon konsi defination deni padegi 

Java Made interfaces to tell "Pure What" , means Pure abstraction , but abhi new java version me function define kar sakte ho lekin old java me declare ka hi tha

also tells the responsibilities , capabilities and roles of classes 

agar khudko koi car bolna chahta hai toh, interface says me kuch method bataunga unko aapko define karna padega , rules hai
interfaces tells the responsibilities of the classes , when you want to declare interface then "able" jod dena bhai , thike ? means verbs



abstract class aapko families of similar objects batati hai , similar objects ko group kar pau 

abstract class bolta hai ki ham kis group ko belong karte hai , combines it , okay ?

if you think your code represents the families then please use abstract class , else if you think parent class is more over the contract then use interfaces

interfaces solves the problem of multiple inheritance !!

interface ke saare method by default public hotey , filhaal ye samjho 
in the child class ,  means aap unki visibility ko entend kartey , not narrow down 


*/

package code.abstraction;

public class HighLevelAbstractionUsingInterfaces {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

interface Car {
    void start();
    void accelerate();
    void brake();
}

class FuelCar implements Car {
    @Override
    public void start() {
        System.out.println("Fuel Car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel Car has started accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fuel car has applied brake");
    }
}

class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("Electric Car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Car has started accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric car has applied brake");
    }
}