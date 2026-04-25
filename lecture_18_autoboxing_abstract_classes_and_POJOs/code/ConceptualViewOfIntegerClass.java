package code;

public final class ConceptualViewOfIntegerClass {
    private final int value;

    public ConceptualViewOfIntegerClass(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static ConceptualViewOfIntegerClass valueOf(int x) {
        return new ConceptualViewOfIntegerClass(x); // but valueOf has concept of caching , Real Integer.valueOf() uses caching for small numbers (-128 to 127).
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ConceptualViewOfIntegerClass other = (ConceptualViewOfIntegerClass) obj;
        return this.value == other.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
}

/*

Once you understand Integer Class, you can easily conceptualize other wrapper classes like Double, Flotat, etc. Double has method doubleValue() like Integer has intValue & so on.
*/