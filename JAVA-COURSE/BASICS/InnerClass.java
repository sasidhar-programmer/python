class Outer { 
    int a ;     // member variable  

    public void show() {     // member methods 
        System.out.println("This is outer class"); 
    }     

    // Innner classes    Member classes 
    class Inner { 

        public void display() { 
            System.out.println("This is inner class"); 
        }
    }


}


public class InnerClass { 
    public static void main(String[] args) { 

        Outer out = new Outer(); 
        out.show();  

        Outer.Inner in = out.new Inner(); 
        in.display();       
    }
    
}