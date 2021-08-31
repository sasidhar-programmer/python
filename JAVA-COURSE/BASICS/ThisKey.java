class This { 
    // creat a constructor   
    int num1; 
    int num2; 
    int result;       // instance variables 

    public This(int num1, int num2) {  

        this.num1 = num1; 
        this.num2 = num2;     // this represent the current object 
        result = num1 + num2 ; 
        System.out.println("This keyword reference" +" "+ result) ; 
        
    }
}



public class ThisKey { 
    public static void main(String[] args) { 

        // create the object for above class 
        This  th = new This(45,56);  
         
    }
    
}