// Encapsulation -  Binding the variables with the methods to data safety
//            private is used to declare the variables 

//  Getters and setters are used 

// make a class student 

class Students { 
    // variables must be in private 
    // private means we can't access the variable out side the class  we need to 
    //  change the variables using the methods  

    private int rollno ; 
    private String name;  


    // method for setting the rollno 
    public void setRollno(int rollno) {  

        this.rollno = rollno; 
    } 

    // method for getting the rollno 
    public int getRollno() { 
        return rollno; 
    } 

    // method for setting name 
    public void setName(String  name) { 
        this.name = name; 
    } 

    // method for getting name 
    public String getName() { 

        return name; 
    }
}

public class Encapsulations { 

    public static void main(String[] args) {
        Students s = new Students(); 
        s.setName("Monika"); 
        s.setRollno(92);
        System.out.println(s.getName()); 
        System.out.println(s.getRollno());  
    }
    
}