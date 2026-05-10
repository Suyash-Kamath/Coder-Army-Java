package code;
// Agar ek kaam hai jo ek hi baar karna hai and agli baar nahi  , uskeliye hi Anonymous class ko laaya hai 
public class AnonymousClass {
    public static void main(String[] args) {
        // Person p1= new Person();
        // p1.introduce();

        // Person p2= new Guest();
        // p2.introduce();

        Person p2 = new Person(){
            @Override
            void introduce(){
                greet();
                String name ="Suyash";

                System.out.println("Hi I am  "+ name);
            }

            void greet(){
                System.out.println("Hello");
            }
        };

        p2.introduce();

        // p2.greet(); , hy basic inheritance and polymorphism ke chalte , error aayega 
    }
}

class Person{
    void introduce(){
        System.out.println("Hi I am a Person");
    }
}

// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hi I am a Guest");
//     }
// }


// Anonymous class cannot have constructor 


// Conclusion is that Static nested class is used in codebase , sabse jyada , fir inner class , but kam use hoti  and usse bhi kamm Anonymous class which is used in old java but got replaced with lambdas and least is local 