// methods Inside class defination 
// outside class defination 


#include<iostream> 
using namespace std;  

class Myclass  { 

    public : 

       void my_method() {     // method inside the class 
           cout<<"method from c++" << endl;  
       }
       
       int square(int x) ;      /// method declared in order to define method outside the class 
     

};  

int Myclass::square(int x) {    // defining method that declared above 

    return x*x; 
}


int main() {  

    Myclass object; 
    object.my_method(); 
    cout<< object.square(55) << endl; 
     

    return 0; 

}