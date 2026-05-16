package code;

import java.io.IOException;


public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        int x = System.in.read(); // Hey , iska default hi integer type hai , the return type
        System.out.println((char)x);

    }
}


/*

Stream -> InputStream aand OutputStream , these are the two Parent Abstract Classes , where chgild class of OutStream is PrintStream 


the problem with read() is that it reads only one byte at a time , even if you write "Suyash" , it reads only 'S' and remaining goes into InputBuffer

Question is now , Jab 1 byte of data ready karte hai , but char in Java is of  two Bytes right ?, No No , 
It is all  becuase it is in unicode , for that it needs 2Bytes to represent 
but when we talk about the ASCII values jo hum keyboard me input kartey hai , jo normal english character ho sakta hai ya special symbols
ho sakte hai . Wo hamare 1 byte me aa jaate hai 

*/