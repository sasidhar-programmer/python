// Dynamic method despatch 

class OverRide { 

    public void shows() { 
        System.out.println("In override class");
    }
}

class Ride2 extends OverRide {  

    @Override
    public void shows() {  
        super.shows();
        System.out.println("In Ride2 class"); 
    }
} 

class Ride3 extends Ride2{ 

    public void shows() { 
        super.shows();                                
        System.out.println("In Ride 3 class");
    }
}

public class DynamicMethodDispatch { 

    // compile time and runtime polymorphism 
    public static void main(String[] args) { 

        OverRide or = new Ride2(); // run time polymorphism 
                                   // creating object with override class reference so 
                                   // the method you call need present in override and ride2
                                   // class 
        or.shows();
        or = new Ride3(); 
        or.shows();             // dynamic method dispatch  - once you change the object 
                            // it is calling the other method it is called dynamic method 
                            // dispatch 
    }
    
}