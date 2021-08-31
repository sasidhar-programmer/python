#include<iostream> 
using namespace std; 


int main() {  
   // referance variable 
    string food = "chapathi"; 
    string &tiffen = food; 

    cout << food << endl; 
    cout << tiffen << endl;  

    // get memory address 
    cout << &food << endl ; 
    cout << &tiffen << endl; 
    

    return 0; 
}