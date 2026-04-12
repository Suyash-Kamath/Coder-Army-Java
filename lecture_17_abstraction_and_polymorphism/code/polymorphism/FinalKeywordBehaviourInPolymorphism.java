package code.polymorphism;

public class FinalKeywordBehaviourInPolymorphism {

    public static void main(String[] args) {

        // ─── FINAL METHOD BEHAVIOUR ────────────────────────────────
        // Final methods are LOCKED — cannot be overridden by child class
        // @Override annotation is NOT allowed on final methods — compile error
        // Child class inherits the final method but cannot change it
        // Parent's version will ALWAYS run — no exceptions

        A a = new B();
        a.fun();        // Prints "fun in A" — overridden, B's version runs
        a.finalFun();   // Prints "finalFun in A" — ALWAYS A's version runs
                        // Even though object is B, final method cannot be overridden

        System.out.println("---");

        B b = new B();
        b.fun();        // Prints "fun in B" — overridden
        b.finalFun();   // Prints "finalFun in A" — still A's version runs
                        // B inherited it but could not change it

        System.out.println("---");

        // ─── FINAL CLASS BEHAVIOUR ─────────────────────────────────
        // A final class cannot be extended by any child class
        // If you try to extend a final class — compile error immediately
        // Example: String class in Java is final
        // You cannot write: class MyString extends String — compile error

        // FinalClass obj = new FinalClass();
        // obj.show(); // Works fine — final class can still be instantiated
                       // It just cannot be extended

        FinalClass fc = new FinalClass();
        fc.show(); // Prints "I am a final class — no one can extend me"

        // ─── FINAL VARIABLE BEHAVIOUR ──────────────────────────────
        // Final variables are constants — cannot be changed after assignment
        // Must be assigned exactly once

        final int x = 10;
        // x = 20; // compile error — cannot reassign final variable
        System.out.println("Final variable x = " + x);
    }
}

// ─── CLASS A ───────────────────────────────────────────────────────
class A {

    // Normal method — CAN be overridden
    // @Override is ALLOWED in child class for this method
    void fun() {
        System.out.println("fun in A");
    }

    // Final method — LOCKED, cannot be overridden
    // @Override is NOT allowed in child class for this method — compile error
    // Child class inherits this method but cannot change its behaviour
    final void finalFun() {
        System.out.println("finalFun in A — locked, cannot be overridden");
    }
}

// ─── CLASS B ───────────────────────────────────────────────────────
class B extends A {

    // Normal override — @Override is ALLOWED here
    // Because fun() in A is not final, not static, not private
    @Override
    void fun() {
        System.out.println("fun in B");
    }

    // Trying to override finalFun() — NOT ALLOWED
    // Uncommenting below code will give COMPILE ERROR:
    // "Cannot override the final method from A"
    // @Override
    // void finalFun() {
    //     System.out.println("finalFun in B"); // COMPILE ERROR
    // }
}

// ─── FINAL CLASS ───────────────────────────────────────────────────
// Final class cannot be extended by anyone
// @Override has no relevance here since no child class can exist
final class FinalClass {

    void show() {
        System.out.println("I am a final class — no one can extend me");
    }
}

// Trying to extend FinalClass — NOT ALLOWED
// Uncommenting below code will give COMPILE ERROR:
// "The type ChildOfFinal cannot subclass the final class FinalClass"
// class ChildOfFinal extends FinalClass {
// }