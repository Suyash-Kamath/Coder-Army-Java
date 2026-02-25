package Homework;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        int grade = 82;
        if(grade>=90){
            System.out.println("Grade A");
        }
        else if(grade>=75){
            System.out.println("Grade B");
        }
         else if(grade>=60){
            System.out.println("Grade C");
        }
        else if(grade>=40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
