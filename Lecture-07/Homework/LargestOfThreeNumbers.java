package Homework;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int first = 10;
        int second = 25;
        int third =15;

        if(first>second && first>third){
            System.out.println(" Largest number is "+first);
            
        }
        if(second>first && second>third){
            System.out.println(" Largest number is "+second);
            
        }
        else{
            System.out.println("Largest Number is "+third);
        }
    }
}
