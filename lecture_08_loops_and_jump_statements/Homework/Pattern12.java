package homework;
/*

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 



*/

public class Pattern12 {
    public static void main(String[] args) {
         char sp=' ';
        for(int i=1;i<=5;i++){
            for(int j=5-i;j>=1;j--){
                System.out.print(sp);
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++){

            // spaces
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }

            // stars
            for(int k = 5; k >= i; k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
