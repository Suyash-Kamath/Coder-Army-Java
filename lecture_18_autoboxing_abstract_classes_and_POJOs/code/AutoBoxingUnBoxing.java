/*

When Autoboxing and Unboxing is applied

Assignments
Methods call
Arithmetic operations
*/

package code;


public class AutoBoxingUnBoxing {
    public static void main(String[] args) {

        // Autoboxing
        int x = 10;
        Integer y = x;
        // Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y); // unboxing kar raha hai kyuki , I am printing y directly and if you write y.intValue() , then too it is correct

        // Unboxing
        // Integer a = new Integer(20); // it is depriciated 
        //  Integer a =  Integer.valueOf(20); 
        Integer a = 20 ;// apne aap autoboxing ho jata hai 
        int b = a; // apne aap unboxing ho rahi hai 

        System.out.println(a);
        System.out.println(b);

        Integer x1=50;
        printIntegerUnbox(x1);

        int x2=50;
        printIntegerAutobox(x2);

        Integer x3 = 10;
        Integer x4= 20;
        int sum = a+b; // Internally Integer.valueOf() is called for x3 and x4
        System.out.println(sum);




    }

    static void printIntegerUnbox(int x){
        System.out.println(x);
    }

    static void printIntegerAutobox(Integer x){
        System.out.println(x);
    }
}
