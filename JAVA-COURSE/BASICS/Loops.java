public class Loops {
    public static void main(String[] args) {
        int i = 1; 
        while(i<=30) {    // while loop 

            if(i%2==0)    System.out.println("even_number  ->"+ i); 
            else          System.out.println(" odd number  ->"+ i); 

            i++; 
        }   
        System.out.println("Completed rendering"); 
    }
    
}