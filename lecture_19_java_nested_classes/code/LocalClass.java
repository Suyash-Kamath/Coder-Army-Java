package code;

public class LocalClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}


class Outer{

    // static private int x = 4; // instance variable 

    void greet(){
        
        class Local{
            void sayHello(){
                int y = 5; // this is local variable 
                // y++ ; // canot do this , final declare nahi kiya toh modify nahi kar sakte 
                System.out.println(y);

            }
        }

        Local local = new Local();
        local.sayHello();
    }
}

// Use case => agar hame class banani hai , kuch methods ko logically group kare ek aur method ke andhar jiska use uss mathod ke andhar hi ho jaaye 

// Where can you use this Local Class => Constructor , Method , If , Loop, Static Block

// effectiev final variable rule 