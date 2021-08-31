class Testing { 

    public Testing() {           // default constructor 

        System.out.println("default constructor"); 
    } 
     
    public Testing(int a)  {         // constructor overloading 
        
        int num1 = a; 
        System.out.println("Second Constructor" + num1);

    } 

    public Testing(int k , double d) {    // constructor over loading 

        int num2 = k; 
        int num3 = (int) d; 

        System.out.println("third constructor" + k + d); 
    }

}



public class ConstructorOverloading { 

    public static void main(String[] args) { 

        Testing ts = new Testing(44, 556.90);   
        

    }
    
}