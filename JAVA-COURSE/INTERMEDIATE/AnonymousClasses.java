/* 
    Anonymous classes  
    if you have class A and it has a method. if  your purpose is to overrider 
    the method that is in class A you need to create another class B and overrinde the 
    method in class A ..  For this purpose you can use anonymous class 


*/

class AnonymousDemo { 

    public void show() {        // method inside the class 
        System.out.println("IN normal class");    
    }
}




public class AnonymousClasses {  
    public static void main(String[] args) {  

        //  overrinding the method show using anonymous class

        AnonymousDemo ad = new AnonymousDemo() { 
                                                  // anonymous class that overrides 
                                public void show() { 
                                    //super.show();  you can use super method if you want
                                    System.out.println("Overrinding using anonoymous class"); 
                                }
                            };   
        ad.show();
         
    }
    
}