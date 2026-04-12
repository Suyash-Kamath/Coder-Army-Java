package code.polymorphism;

public class StaticKeywordBehaviourInPolymorphism {
    public static void main(String[] args) {

        // ─── STATIC METHOD BEHAVIOUR ───────────────────────────────
        // Static methods are bound to REFERENCE TYPE, not actual object
        // So even though actual object is B, A's fun() will run
        // This is called METHOD HIDING, not overriding

        A a = new B();
        a.fun(); // Prints "Fun in A" — because reference type is A

        B b = new B();
        b.fun(); // Prints "Fun in B" — because reference type is B

        // Both a and b point to B object in heap
        // But static methods don't care about the object
        // They care about the REFERENCE TYPE
    }
}

// Static methods belong to CLASS, not to objects
// So they cannot be overridden — they get HIDDEN
class A {
    static void fun() {
        System.out.println("Fun in A");
    }
}

class B extends A {
    // @Override is WRONG here — static methods cannot be overridden
    // This is METHOD HIDING, not method overriding
    // Removing @Override annotation
    static void fun() {
        System.out.println("Fun in B");
    }
}