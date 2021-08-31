#include<iostream> 
using namespace std ; 



int main() {  

    string cars[5] = {"BMW", "Skoda", "RangeRover", "Lamborghini", "Ford"} ;

    cout << cars[0] << endl; 
    cars[0] = "Ferrai"; 
    cout << cars[0] << endl; 
    
    for(int i = 0 ; i<5; i++) {  

        cout<<cars[i]<<endl;  

    } 

    int nums[]  = {}; 

    for(int j = 0 ; j<=23; j++)  { 
        nums[j]  = j + 1; 
    } 

    for(int k = 0; k<23; k++) { 
        cout<<nums[k]<<endl;
    }

    


    return 0; 
}