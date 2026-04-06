package homework;
/*

1
22
333
4444
55555

*/
public class Pattern10 {
    public static void main(String[] args) {
        int number=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number);
            }
            number+=1;
            System.out.println();
        }
    }
}
