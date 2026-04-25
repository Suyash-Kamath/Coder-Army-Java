package code;

public class EqualOperatorVsEqualsMethod {
   public static void main(String[] args) {
    int x = 100;
    int y = 100;
    System.out.println(x==y);

    Integer a = 200;
    Integer b = 200;

    System.out.println(a == b); // hey this compares are the references(address) in a and b same , not values 200

    System.out.println(a.intValue()==b.intValue());

    // or 

    System.out.println(a.equals(b)); // equals Integer class se nahi aaya , uske parent kisi ek parent se aaya hai 


   }
}
