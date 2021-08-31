// varargws refers varible length argumens  

class Cal { 
    // in the parameter (...) represents when we call method we can pass as maney as arguments
    // it reach like array 
    public int add(int ... n) {   

        int sum = 0 ; 
        for(int k: n) { 
            sum += k; 
        } 
        return sum; 
    }
}



public class Varargws { 
    public static void main(String[] args) { 
        Cal c = new Cal(); 
        System.out.println(c.add(5, 6, 6,879, 45,78)); 
        
    }
    
}