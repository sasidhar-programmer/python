abstract class Writer { 

    public abstract void write(); 
}

class Pen extends Writer { 

    public void write() { 
        System.out.println("I am pen");
    }

} 
class Pencil extends Writer {  

    public void write() { 
        System.out.println("I am pencil"); 
        
    }

}

class kit { 
    public void dosomething(Writer pc) {  
        pc.write();

    }

}


public class Abstractbasic { 
    public static void main(String[] args) { 

        kit k = new kit(); 
        Writer pc = new Pencil();  
        Writer p = new Pen(); 

        k.dosomething(p);    
        k.dosomething(pc);
    }
}