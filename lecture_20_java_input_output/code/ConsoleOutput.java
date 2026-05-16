package code ;

public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.err.println("Bye");
    }
}

// System is a class -> it has a member PrintStream out where out is reference variable ;
// PrintStream is a class where it contains the method println()


/*

class System {

public static final PrintStream out = null // here null means the console

}

class PrintStream{
void println(){

}
}

hey , how JVM knows that System class code comes from where ?

answer is java.lang package, which is an internal package which gets imported by default by compiler

talking about the PrintStream 


// err -> error -> this is just for concern of serperating normal vs error message 
// output -> For business case
*/