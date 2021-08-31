class Static { 

    int emp_id;                      // class memory  loads only one time 
    int emp_sal; 
    static String ceo;   // static variable is same for all objects   

    static {  

        ceo = "Sasidhar"; 
        System.out.println("satic block loads only once because class memory loads only once"); 

    }

    public Static() {  

        emp_id = 0; 
        emp_sal = 0;  
        System.out.println("constructor is called whenever the object is called");  
        
    }

    public void show() { 
        System.out.println(emp_id + ":" + emp_sal + ":" + ceo); 
    }

}


public class StaticKey { 
    public static void main(String[] args) { 
        Static emp = new Static();  
        Static emp2 = new Static();  

        emp.emp_id = 55; 
        emp.emp_sal = 60000; 

        emp2.emp_id = 700000; 

        emp.show() ;  
        emp2.show();
        
    }
    
}