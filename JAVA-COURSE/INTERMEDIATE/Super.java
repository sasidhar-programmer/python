// describing the super method 
/* 
super() method exists in subclass or derived classes which call the constructor of 
parent class 


*/
class A { 

    public A() { 
        System.out.println("In A constructor");
    } 

    public A(int i) { 
        System.out.println("cons overload in A"); 
    }
}


class B extends A { 

    public B() { 
        System.out.println("In B constructor"); 
    }  
    

    public B(int i) {  
        super(i); 
        System.out.println("cons overload in B");
    } 


    public void sample() { 

    }
}




public class Super { 
    public static void main(String[] args) {
        B  cons = new B(7);  
        cons.sample(); 

    }
    
}