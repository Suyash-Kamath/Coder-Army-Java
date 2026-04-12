/*

Java Implements High Level Abstractin using Abstract classes and interfaces

in inheritance, parent class object can refer child class object 

but alone inheritance won't solve but let's try , becuase still what and how is not seperated in the parent class

*/


package code.abstraction;

public class HighLevelAbstractionUsingInheritance {
    public static void main(String []args){
        Car c = new ElectricCar();
        c.drive();
    }
}


class Car{
    void drive(){
        System.out.println("Generic Car Driving");
    }
}

class FuelCar extends Car{
    @Override
    void drive(){
        System.out.println("Fuel Car Driving");
    }
}

class ElectricCar extends Car{
    @Override
    void drive(){
        System.out.println("Electric Car Driving");
    }
}