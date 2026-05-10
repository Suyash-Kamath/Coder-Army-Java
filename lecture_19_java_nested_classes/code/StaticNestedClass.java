package code ;

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);

        inner.func();
    }
}


class Outer{

   private static int x=4;
    int y;
  

    static class Inner {


        Outer outer;
        String name;
        static int number;

        Inner(Outer outer){
            this.outer = outer;
        }

        void func(){
            System.out.println(x);
            System.out.println(outer.y);
        }

        static void func2(){

        }
    }
}

class BankAccount{

    private static class InterestCalculator{
       static  double calculateYearly(double principal,double rate){
            return principal * rate;
        }
    }

    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal, 0.09) ;
    }
}

// use cases of static nested class

/*

1. As helper class for any outer class
2. Builder Design Pattern
3. If you want to have static methods inside the nested class
4. Request Response DTO 

*/