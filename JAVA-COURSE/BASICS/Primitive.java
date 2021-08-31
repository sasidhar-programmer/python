//  primitive data types 

public class Primitive { 
    public static void main(String args[]) { 

        long a = 5000000000l;  // 8 bytes 
        int x = 56;  // 4 bytes -> 32 bits 
        short s = 5;  // 2 bytes -> 16 bits 
        byte b = 2;  // 1 byte -> 8 bits  

        float f = 55.6f; 
        double d = 65.7;  // for fractional values 


        char z = 's'; // for character  
        z = 89; 
        System.out.println(z);   // it gives ASCII values  
        
        double dl = 55;   // Implicit conversion  

        int k = (int) 56.89 ; // type casting 

        System.out.println(k); 
        

    }
}