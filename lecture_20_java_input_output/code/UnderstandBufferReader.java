package code;

import java.io.*;

public class UnderstandBufferReader {
    public static void main(String[] args) throws IOException{
        // Convert the stream of byte into stream of character
        // InputStreamReader isr = new InputStreamReader(System.in);
        // Can also do this
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name =br.readLine();
        System.out.println(name);
    }
}



/*

Flow 

1. Suyash
2. OS me buffer ne stream of bytes me convert kiya , bytes ka meaning is pehele ascii value nikaalo then binary me convert kardo (65,100,17,13,34,45)
3. System.in (InputStream Object) recieves bytes from os
4. InputStreamReader converts stream of byte into stream of characters ('S','u','y','a','s','h')
5. BufferedReader -> stream of characters ko read karke chunks me java ke buffer me store kardega 
when called readLine() , string form karega uss Buffer me se read karke and stores it in the name vaali field me 
when when use System.out.println(name) , then my whole name "Suyash" gets printed 

*/