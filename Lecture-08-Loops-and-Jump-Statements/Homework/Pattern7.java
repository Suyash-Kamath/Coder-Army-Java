/*

1
23
456
78910

*/

public class Pattern7 {
    public static void main(String[] args) {
        int number=1;
        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(number++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
