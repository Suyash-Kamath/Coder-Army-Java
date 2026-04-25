/*
Abstract Class :
1.Any class which cannot be instantiated
2.Can contain abstract method (method without implementations)
3.Can also contain normal methods
4.Is meant to be extended
*/


/*

Questions :

1. Can abstract class have constructors -> Yes, constructor is there if you make the Child's Object, when Child Class's object is created then Parent class's constructor is called
2. Can abstract class can have final keyword -> No , final means inherit nahi kar sakte and abstract means inherit karna padega 
3. Can abstract class have static methods/variables/blocks -> Yes, you can create 
4. Can abstract class have private methods -> They can have , but private method should not be abstract , it should be protected or public
5. Can abstract class have final methods -> yes they can have , it simply means that override nahi ho sakta and also final method abstract ho hi nahi sakte
6. Can abstract classes have no abstract methods -> Yes they can have , what if you want to have the Default implementations

*/
package code;

public class InterviewQuestionOnAbstractClass {
    public static void main(String[] args) {
        
        Animal a = new Dog("Sweety");
        a.makeSound();
    }
}


abstract class Animal{
    String name;
    static String type;


    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping");
    }

    static void eat(){

    }

    private void defence(){

    }
}

class Dog extends Animal{

    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Barking sound");
    }
}