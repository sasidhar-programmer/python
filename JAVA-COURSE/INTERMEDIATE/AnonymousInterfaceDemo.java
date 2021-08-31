/*   Types of interfaces 
-> Normal --- > has more than one method 
-> single abstract method (only one method)- functional interface - lambda expression 
-> marker interface (no method) 



*/




interface Abc { 
    void rendering(); 
}

public class AnonymousInterfaceDemo { 
    public static void main(String[] args) {   

        Abc a = new Abc() { 
            // Anonymous class for implementing interface 
            public void rendering() { 
                System.out.println("rendering"); 
            }
        }; 

        a.rendering(); // method calling 

        
    }
    
}