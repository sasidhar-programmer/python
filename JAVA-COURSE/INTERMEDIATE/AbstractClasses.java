

/* abstract classes means when we use abstract classes we cannot create object of abstract 
   classes in order to use abstract classes we need to create another class and extend the 
   abstract class 

   -> we can also define the abstract methods 
   -> if a class contains abstract method the class need to be the abstract class 
   -> if a class is abstract class it is not compulsary to have abstract method 

*/ 

// abstract class 

abstract class Human { 

    public abstract void eat(); // abstract method are declared not defined 
    
    public void walk() {  
        System.out.println("walking");

    }

} 

class Man extends Human {  

    public void eat() {  // using abstract method that declared above in abstract class 
                         // is compulsary otherwise it will throw an error 
      System.out.println("eating"); 

    }


}

public class AbstractClasses { 
    public static void main(String[] args) {  

        Man h = new Man();   // we can create object by using human class reference
        h.eat();
        h.walk();
        
    }
    
}