
@FunctionalInterface    // it better to denot because if you try to define more method 
                 // .. it shows errors functional interface means it has only one method
interface abcd { 
     void showing(); 
}



public class LambdaExpressions { 
    public static void main(String[] args) { 

        // creating object for interface using anonymous class in new method 
                        

          // this is known as Lambda expressions possible only in functional interfaces
        abcd a = () -> System.out.println("By arrow new way");  
        a.showing(); 
        
    }
    
}