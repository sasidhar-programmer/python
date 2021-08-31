/* 
*  In java Integer, Float , Double..  are classes that extends the abstract class Number 
*   here we can create object for Interger, Float classes  
*    so we can use Number class that has all Integer , Float classes instead of creating 
     the objects and mehthods  

    *  refer below program to understand why we need the abstract class 
*/

class Printer { 

    public void show(Number i) {   // Number is a abstract super class that has all the 
                                   // the properties of Integer, Float  , int, ....

        System.out.println("the number is  " + i) ; 
    }
}



public class WhyAbstract {
    public static void main(String[] args) { 

        Printer p = new Printer(); 
        p.show(55); 
        p.show(55.6789); 
        p.show(89.4f); 
        
    }
}