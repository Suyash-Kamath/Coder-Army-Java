package code;

public class InnerClass {
    public static void main(String[] args) {
        
        // Outer outer = new Outer();

        // Outer.Inner inner = outer.new Inner();
        // Java gives special syntax where I can do the work

        Outer.Inner inner = new Outer().new Inner(); // this is the simple syntax , use this syntax if we don't want the reference of outer class and use object of inner class
        inner.fun();
        // inner.fun2();
        // Outer.Inner.fun2();
    }
}


class Outer{
    int x = 10;
    class Inner{

        // int x = 20 ;

        // andhar se inner class ke pass kuch aisa likha hota hai 
        // Outer outer  , so if you write x in the Inner class for printing , compiler usko outer.x karta hai 

        void fun(){
            System.out.println(x);
            // System.out.println(Outer.this.x);
        }

        static void fun2(){
            System.out.println("Hello from static method ");
        }
    }
}

/*

Inner class ke andhar static variable and static method nahi ho sakte hai , kar sakte hai bas kyu karna , 
wo bolega ki static method ko object se kyu call kar rahe ho ? usko seedha class name se call kardo 

Java 16 se pehle yeh true tha ki static methods nahi ho sakte kisi bhi Inner class me as well as static variable 

*/