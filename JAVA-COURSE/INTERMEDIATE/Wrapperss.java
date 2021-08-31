
public class Wrapperss {  
    public static void main(String[] args) { 

        int i = 5;    // int is primitive data type 
        System.out.println(i+"\n");

        /* every thing you do in java is an object . But int i 'i' is not a object 
         java have inbuilt classes for data types   
         Interger is a class for int 
         Character is a class for char 
         Boolean  is a class for bool 
            .....
            ......
       */  
      Integer ii =  Integer.valueOf(55);  // Wrapper classes  
      System.out.println(ii + "\n");

      int k = 90;   // k is primitive  

      Integer l = Integer.valueOf(k);  // k is primitive keeping k in the integer wrapper 
                                      // class is Boxing or wrapping 

      int j = l.intValue(); // taking above l value and fetching to the j primitive variable
                            // is called  UnBoxing or unwrapping  
        System.out.println(j + "\n"); 

      Integer a = 44;   // here Integer.valueOf is automaticlly done by java so this is 
                          // called AutoBoxing or AutoWrapping 

      int b = a;  // fetching above a to b here .intvalue() is automated by java  so this
                  // called AutoUnboxing or AutoUnWrapping  

        System.out.println(b); 

      String str = "1234"; 

      int x = Integer.parseInt(str);  // parseInt is static method of class Integer 
                                 // it takes string str in this case and convert to int 
        System.out.println(x + "\n"); 
                                 
     //Double.parseDouble() 
     //Float.parseFloat() 
     //Long.parseLong()
     //Short.parseShort() 
     //Byte.parseByte()         



    }
    
}