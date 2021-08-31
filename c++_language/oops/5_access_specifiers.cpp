#include<iostream> 
using namespace std; 


class Private {  

    private : 
       string name = "sasi"; 

       int x_square(int x) { 
           return x * x ; 
       }

    public: 
       
       int getter() { 
           cout<< x_square(55) << " " << "getting from private method" << endl;  
       }
 


}; 

class second { 

     public: 
     int x = 45; 
     int y = 67; 
 }; 

int main() {  


    Private p; 
    p.getter() ;  
     

    second s; 
    
    cout<<s.x << endl; 
    cout<< s.y; 
    
    return 0; 
}