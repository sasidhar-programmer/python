/* 
*  -> final is a keyword in java 
      we can use final variables to constants
                 final classes to prevent extends our classes 
                 final methods to prevent method over riding 

*/

final class Finall {    // final class we cannot extend this class anymore .... 

    final double PI = 3.14;   // we cannot change the value PI once it is declared as  final 
 
    public final void show() {        // we can't override this method because it delcare 
                                     //  ... as  final method 

        System.out.println("final show method");
    }
}


public class FinalDemo { 
    public static void main(String[] args) { 
        Finall f = new Finall(); 
        f.show();
        System.out.println(f.PI); 
        
    }
    
}