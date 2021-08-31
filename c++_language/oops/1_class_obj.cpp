#include<iostream> 
using namespace std; 


class car { 
    public  :  // access modifier 
       string brand; 
       string name ; 
       int num; 
}; 





int main() {  

  // creating object  

    car Ford; 
    Ford.name = "Ford_new"; 
    Ford.brand = "Ford_comfort"; 
    Ford.num = 23; 

    cout<< Ford.name << endl; 
    cout<< Ford.brand << endl; 
    cout<< Ford.num << endl;  

    car car2; 
    car2.name = "Ferrari"; 
    car2.brand = "F"; 
    car2.num = 123456;  

    cout<< car2.name << endl << " " << car2.brand << " " << endl; 
 
    return 0; 
}