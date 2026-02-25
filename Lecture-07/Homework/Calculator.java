package Homework;

public class Calculator {
    public static void main(String[] args) {
        int operandOne = 10;
        char operator ='*';
        int operandTwo = 10;

        switch (operator) {
            case '-':
                System.out.println("The value of expression is "+(operandOne-operandTwo));
                break;

            case '+':
                System.out.println("The value of expression is "+(operandOne+operandTwo));

                break;
            case '*':
                System.out.println("The value of expression is "+(operandOne*operandTwo));

                break;
            case '/':
                System.out.println("The value of expression is "+(operandOne/operandTwo));

                break;
        
            default:
                break;
        }

    }
}
