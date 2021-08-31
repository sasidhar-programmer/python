#include<iostream> 
using namespace std; 


int main() {  

    int x = 23, y = 45, z = 65; 

    if(x > y) { 
        cout<< x << "is greater than " << y <<endl; 
    } 
    else if(x > z) { 
        cout<< x << "is greater than " << z <<endl; 
    } 
    else { 
        cout<< x <<" "<< "is smaller than"<< y <<" " << z <<endl;  
    }
    
    // Ternary operator 

    int time = 20; 
    string res = (time < 18)? "Good day" : "Good evening";  
    cout<<res; 

    return 0;  
}