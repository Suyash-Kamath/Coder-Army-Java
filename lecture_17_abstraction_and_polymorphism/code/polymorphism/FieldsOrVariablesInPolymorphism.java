package code.polymorphism;

public class FieldsOrVariablesInPolymorphism {

    public static void main(String[] args) {

        // ─── FIELDS DO NOT PARTICIPATE IN POLYMORPHISM ─────────────
        // Methods are bound to ACTUAL OBJECT type (runtime decision)
        // Fields are bound to REFERENCE TYPE (compile time decision)
        // So fields do NOT get overridden — they get HIDDEN

        A a = new B();

        // Field access — bound to REFERENCE TYPE (A)
        System.out.println("Field via A reference : " + a.x); // Prints 10 — A's x
                                                               // Even though object is B
                                                               // Field does NOT follow object

        // Method access — bound to ACTUAL OBJECT (B)
        a.showX(); // Prints "x in B = 20" — B's showX() runs
                   // Because methods DO follow actual object

        System.out.println("---");

        // To access B's field directly, you need B reference
        B b = new B();
        System.out.println("Field via B reference : " + b.x); // Prints 20 — B's x

        System.out.println("---");

        // ─── PROOF THAT FIELDS ARE HIDDEN, NOT OVERRIDDEN ──────────
        // Both A's x and B's x exist separately in memory
        // They are two completely different variables
        // Just happen to have the same name

        B b2 = new B();
        System.out.println("B's own x        : " + b2.x);       // 20 — B's x
        System.out.println("A's x via super  : " + b2.getSuperX()); // 10 — A's x
        // Both exist at the same time — proof they are separate variables

        System.out.println("---");

        // ─── WORKAROUND — USE METHODS TO GET POLYMORPHIC BEHAVIOUR ──
        // If you want field access to behave polymorphically
        // Wrap the field inside a method and override that method

        A a2 = new B();
        System.out.println("Via method (polymorphic) : " + a2.getX()); // Prints 20
        // Because getX() is overridden in B
        // Method follows actual object — so B's getX() runs
        // Returns B's x which is 20
    }
}

// ─── CLASS A ───────────────────────────────────────────────────────
class A {

    // Field x in A
    int x = 10;

    // Method to show x — can be overridden (polymorphic)
    void showX() {
        System.out.println("x in A = " + x);
    }

    // Getter method — can be overridden to achieve polymorphic field access
    int getX() {
        return x;
    }
}

// ─── CLASS B ───────────────────────────────────────────────────────
class B extends A {

    // Field x in B — this does NOT override A's x
    // This HIDES A's x — both exist separately in memory
    // A's x = 10 still exists inside B object
    // B's x = 20 also exists inside B object
    int x = 20;

    // Method overridden — follows actual object (polymorphic)
    // @Override is ALLOWED here — normal method override
    @Override
    void showX() {
        System.out.println("x in B = " + x);
    }

    // Overriding getX() to return B's x
    // This is the WORKAROUND to make field access polymorphic
    // @Override is ALLOWED here — normal method override
    @Override
    int getX() {
        return x; // Returns B's x = 20
    }

    // Helper method to access A's x using super
    // Proves that A's x still exists separately inside B object
    int getSuperX() {
        return super.x; // Returns A's x = 10
    }
}