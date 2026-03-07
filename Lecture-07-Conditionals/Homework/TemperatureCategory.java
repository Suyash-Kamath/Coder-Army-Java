package Homework;

public class TemperatureCategory {
    public static void main(String[] args) {
        int temperature = 30;
        if(temperature<10){
            System.out.println("Very Cold");
        }
        else if(temperature>=10 && temperature<25){
            System.out.println("Moderate");
        }
        else{
            System.out.println("Hot");
        }
    }
}
