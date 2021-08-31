class calc {    // classes in java are declared using class key word 

    // function inside the classes are called methods 

    // add method takes two parameters a and b and return value of a+b 
    // int int in the below method add means our method needs to return the integer value

    public int add(int a , int b) {    
      
        return a+b; 
    } 

    // strr method have "String"  strr() method needs to return any string 
    // if we saw any methods like public "void" method_name() 
    // void means return nothing 

    public String strr() { 

        return "sasidhar"; 
    }

}

public class ClassDemo {  // declaring main class 

    public static void main(String[] args) { 

        calc cal = new calc();  // creating object 
        System.out.println(cal.add(55, 55));   // calling add method using created object
        System.out.println(cal.strr());   // calling strr() method using created object 
       
        
    }
    
}

/* 

key points 
--> function are methods insides the classes 
--> methods return value based on the method data type we assign 
             example :-  public int name() needs to return any integer value 
                         public double name() needs to return any fraction value 
                         public void name() void means return nothing

--> in order to access methods we need to create object 
     example :-  class_name  object_name = new class_name() 

--> calling methods is  "object_name.method(parameters)" 

*/