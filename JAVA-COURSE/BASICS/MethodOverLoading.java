class Casio { 
    // method for adding two numbers 
    public void add(int a, int b) {  

        System.out.println(a + b);  

    } 
    
    // performing the method over loading 
    // same method name but different parameters 

    public void add(int a , int b, double c) { 

        System.out.println(a + b + (int)c);  
    }

}


public class MethodOverLoading { 
    public static void main(String[] args) {  
        Casio cas = new Casio(); 
        cas.add(5,6); // calling the method of class Casio  
        cas.add(45,67,97.4567);  // overloading   
    }
    
}