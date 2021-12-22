import java.util.Scanner;

class Arith {

    int a,b; 

    

    void add(int a, int b) { System.out.println(a+b); }
    void sub(int a, int b) { System.out.println(a-b); }
    void pro(int a, int b) { System.out.println(a * b); }
    void div(int a, int b) { System.out.println(a / b); }

}


class Abc { 
    public static void main(String[] args) {

        Arith ob = new Arith(); 
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of a : \n");
        ob.a = sc.nextInt();
        System.out.println("enter the value of b : \n");
        ob.b = sc.nextInt(); 

        System.out.println("calucated values are below : "); 

        ob.add(ob.a, ob.b); 
        ob.sub(ob.a, ob.b); 
        ob.pro(ob.a, ob.b); 
        ob.div(ob.a, ob.b); 


        

        
    }
}