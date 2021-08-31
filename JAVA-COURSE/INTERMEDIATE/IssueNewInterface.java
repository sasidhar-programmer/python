/*  
we can define methods in interface the problem is when we have two interface that both 
the interfaces have same methods with same name .When we implements both the interfaces 
with one class the java may confuce which method may call 
observe the below to overcome issue 
*/


interface sasi { 
    void me(); 
    void res(); 
    default void samemethod() { 
        System.out.println("sasidhar"); 
    }
}

interface siri { 

    default void samemethod() { 
        System.out.println("sirisha"); 
    }
}

class Ganesh implements sasi, siri { 

    public void me() {  
        System.out.println("declared method"); 
    }  

    public void res() {
         System.out.println("ress"); 
        }
    // to over come problem 
    @Override 
    public void samemethod() { 
        sasi.super.samemethod();  
    }
}

public class IssueNewInterface { 
    public static void main(String[] args) { 

        sasi s = new Ganesh(); 
        s.me(); 
        s.samemethod(); 
        
    }
    
}