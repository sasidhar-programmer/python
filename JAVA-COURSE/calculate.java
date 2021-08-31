import java.util.*; 

class calculate
{
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
      int a,b,c;
      System.out.println("enter 2 numbers");
      a=sc.nextInt();
      b=sc.nextInt();
      c=a+b;
      int sub = a - b;  
      int mul = a * b;  
      int div =  a / b ; 
      System.out.println("sum is"+c); 
      System.out.println("substraction is"+ sub); 
      System.out.println("multiplication is"+ mul);  
      System.out.println("substraction is"+ div) ;  



    }
}