package code.polymorphism;

public class PrivateKeywordBehaviourInPolyMorphism {

    public static void main(String[] args) {

        // ─── STATIC METHOD BEHAVIOUR ───────────────────────────────
        // Static methods are bound to REFERENCE TYPE, not actual object
        // This is METHOD HIDING, not overriding
        // @Override annotation is NOT allowed on static methods — compile error

        A a = new B();
        a.fun();  // Prints "Hello from A" — reference type is A, so A's fun() runs

        B b = new B();
        b.fun();  // Prints "Hello from B" — reference type is B, so B's fun() runs

        System.out.println("---");

        // ─── PRIVATE METHOD BEHAVIOUR ──────────────────────────────
        // Private methods are invisible outside their own class
        // Child class CANNOT see private methods of parent
        // So child class CANNOT override private methods
        // Whatever you write in child class with same name is a BRAND NEW method
        // It has nothing to do with parent's private method
        // @Override annotation is NOT allowed on private methods — compile error

        A a2 = new B();
        a2.callFun2(); // Prints "fun2 in A" — A's private fun2() runs
                       // Even though object is B, B cannot override private fun2()

        B b2 = new B();
        b2.callFun2(); // Prints "fun2 in A" — still A's fun2() runs
                       // B's fun2() is a completely separate NEW method
                       // It does NOT override A's fun2()

        // b2.fun2() is not accessible either — fun2() in B is also private
    }
}

// ─── CLASS A ───────────────────────────────────────────────────────
class A {

    // Static method — belongs to CLASS A, not to objects
    // Cannot be overridden — can only be HIDDEN
    // @Override is NOT allowed on static methods
    static void fun() {
        System.out.println("Hello from A");
    }

    // Private method — invisible outside class A
    // Cannot be overridden by child class
    // Child class cannot even SEE this method
    // @Override is NOT allowed on private methods
    private void fun2() {
        System.out.println("fun2 in A");
    }

    // Public helper to call private fun2() from outside
    // This is how we demonstrate private method behaviour
    public void callFun2() {
        fun2(); // Calls A's private fun2() — always
    }
}

// ─── CLASS B ───────────────────────────────────────────────────────
class B extends A {

    // Static method — METHOD HIDING, not overriding
    // @Override annotation NOT allowed here — will give compile error
    // Because static methods cannot be overridden
    static void fun() {
        System.out.println("Hello from B");
    }

    // This is NOT overriding A's fun2()
    // B cannot even see A's private fun2()
    // This is a BRAND NEW separate method that just happens to have same name
    // @Override annotation NOT allowed here — will give compile error
    // Because private methods cannot be overridden
    private void fun2() {
        System.out.println("fun2 in B");
    }
}