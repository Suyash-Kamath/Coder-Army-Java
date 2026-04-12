/*
Java rule is that if any one method is abstract then make the whole class abstract
and you cannot instantiate that class, okay !!, lets say Car c= new Car and c.accelerate() , but 
the thing is accelerate function is not defined, then how would you tackle ? ok 



if you dont want to implement the abstract method in the parent class in the child class then write the child class also abstract,
in java multiple abstract classes, ek abstract class ko inherit kar sakti hai 

*/

package code.abstraction;

public class HighLevelAbstractionUsingAbstractClass {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
        
    }
}


abstract class Car{
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car{

    @Override
    void accelerate(){
        System.out.println("Fuel Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Fuel Car applying brakes");
    }

}


class ElectricCar extends Car{

    @Override
    void accelerate(){
        System.out.println("Electric Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Electric Car applying brakes");
    }

    void charging(){
        System.out.println("Electric Car is getting Charged");
    }

}