package code.abstraction;

public class LowLevelAbstraction {

    public static void main(String []args){
        Car c = new Car();
        c.start();
        c.accelerate();
        c.brake();
    }
}


class Car{
    String type;

    void start(){
        System.out.println("Starting the Car");
    }

    void accelerate(){
        System.out.println("Writing the logic of acceleration");
    }

    void brake(){
        System.out.println("Writing the logic of the brake ");
    }
}