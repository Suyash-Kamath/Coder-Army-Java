package code;

public class NullPointerExceptionInAutoBoxing {
    public static void main(String[] args) {
        // Integer x = 10;
        Integer x = null; // object null store kar sakte hai , null ka meaning no value
        int y = x; // this cannot store null value  , see primitives cannot store null values 
        // null pe koi bhi method call karne jaaoge toh runtime pe null pointer exception aayega 

        System.out.println(y);

    }
    
}
