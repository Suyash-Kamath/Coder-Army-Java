package homework;
/*


1 
12 
123 
1234 
12345 

*/

public class Pattern6 {
    public static void main(String[] args) {
        int number;
        for(int i=1;i<=5;i++){
            number=1;
            for(int j=1;j<=i;j++){
                System.out.print(number++);
            }
            System.out.println();
        }
    }
}
