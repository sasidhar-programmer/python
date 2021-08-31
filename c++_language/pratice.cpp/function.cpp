#include<iostream> 
using namespace std; 

//function declaration 

//double distance(double velocity, double time_elapsed)  ; 

// function definition 

double distance(double velocity, double time_elapsed) { 
    
        return velocity * time_elapsed  / 2 ;  
} 



int main() {  
    
    // function call 
    cout<<distance(5544.98, 6.9)<<endl; 
    
    return 0;  

} 




 