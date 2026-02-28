/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1



*/

public class Pattern11 {
    public static void main(String[] args) {
        int number;
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                number=(i+j)%2;
                System.out.print(number);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
