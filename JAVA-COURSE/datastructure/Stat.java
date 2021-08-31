class statistics { 

    static void one() { 
        System.out.println("static method"); 
    } 

    static void two() { 
        statistics.one(); 
        System.out.println("static two ");
    }
}


public class Stat { 

    public static void main(String[] args) { 

        statistics.two(); 
        
    }
    
}

