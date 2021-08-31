
public class prime { 
    public static void main(String[] args) { 
        int check  = 0 ;  
        int num = 97; 

        
        if(num==0 || num==1) { 
            System.out.println("not a prime number");
        }
       else if(num == 2) { 
            System.out.println("even prime ");  
        } 
        else { 
            for(int i = 3 ; i<=num; i++) { 
                if(num%i == 0)  check ++; 
            } 
        }   

        if(check == 1) { 

            System.out.println("prime number"); 
        }  else { 
            System.out.println("not a prime"); 
        }
       
        
    }
    
}