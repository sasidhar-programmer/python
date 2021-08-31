

// from java 8 we have feature to define methods in interface 


@FunctionalInterface
interface InterfaceFeature { 
    void show(); // only one method declared, coz functional interface.
    // we can define methods in interface by default 
    
    default void rendering() { 
        System.out.println("rendering new feature");
    }

}

class newfeature implements InterfaceFeature { 
    public void show() { 
        System.out.println("show method "); 
    } 

    @Override 
    public void rendering() { 
        System.out.println("Overriding rendering  method"); 
    }
}


public class InterfaceNewFeature {
    public static void main(String[] args) {
        
        InterfaceFeature iff = new newfeature();  
        iff.show();
        iff.rendering();

        
    }
    
}