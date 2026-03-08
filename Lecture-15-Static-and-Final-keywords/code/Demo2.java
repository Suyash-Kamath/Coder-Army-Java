public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x ;
        x=4; // this is allowed because aap ek hi baar value assign kar sakte hai , but you cannot reassign, theoritically this should not be allowed but in practicality , java allows you to do this 
        System.out.println(x);
    }
}

// Why main is static in Java ?
// Demo v1 = new Demo();
// d1.main()
// but JVM khudse objec create nahi kar sakta , object toh hum create karte hai , so isliye static dediya 
// so JVM does Demo.main()

class Random{
    static final double PI;

    // Random(){
    //     this.PI = 3.14;
    // }

    // I can write a variable both , static as well as final

    static{
        PI = 3.14;
    }

}