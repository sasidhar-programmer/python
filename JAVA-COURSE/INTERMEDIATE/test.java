class one { 

    static  void method1() { 
        System.out.println("executing method"); 
    } 

    public void method2() {  
        System.out.println("executing method 2");  
        one.method1();  
    }
}



class twoo extends one { 
    public void method4() { 

        System.out.println("method 4");  
        one.method1(); 
    }
}

public class test { 
    public static void main(String[] args) { 

        one o = new one();  
        twoo t = new twoo(); 

        o.method2(); 
        t.method4();
        
        
    }
}