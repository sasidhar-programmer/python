import java.util.*; 

public class Centi  
 {  
   public static void main (String args[])  
    { 
        Scanner in = new Scanner(System.in); 
        System.out.println("enter temperature : ") ;

        double Fahrenheit, Celsius;  
          Celsius = in.nextInt();  

          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }
}  