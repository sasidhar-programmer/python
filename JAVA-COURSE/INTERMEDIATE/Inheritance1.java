// single and multilevel inheritance  

class calc {                          // super class 
    public int add(int a, int b) { 

        return a + b; 
    }
}

class Advcalc extends calc {         // sub class 
    public int sub(int a , int b) { 
        return a - b; 
    }
} 

class Veryadvcalc extends Advcalc {   // derived class 
    public int mul(int a, int b) { 
        return a * b; 
    }
}

public class Inheritance1 { 
    public static void main(String[] args) { 

        Veryadvcalc ad = new Veryadvcalc(); 
        System.out.println(ad.add(5, 6)); 
        System.out.println(ad.mul(5,6)); 
        
    }
}