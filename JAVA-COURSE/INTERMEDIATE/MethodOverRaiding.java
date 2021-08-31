class A5 { 
    public void show() { 
        System.out.println("In A"); 
    }
}

class B5 extends A5 { 

    @Override   // it gives compile time error than logical errors  
    public void show() { 
        super.show();
        System.out.println("in B"); 

    }
}


public class MethodOverRaiding { 
    public static void main(String[] args) {
        B5 b = new B5(); 
        
        b.show();
    }
    
}