#include<iostream> 
using namespace std; 

int main() { 

    for(int i = 0 ; i<=10; i++) { 
        for(int j = 0 ; j<=i; j++) {  
            cout<<"*"<<" ";  
            if(j==i) { 
                cout<<endl; 
                break; 
            }  
            
        }
    } 
    return 0; 
} 



