#include<iostream> 
using namespace std; 

int main() { 
    for(int i = 0; i<=120; i++) { 
        cout<<i<<' ';   
        for(int j = 10; j<=120; j+=10) { 
            if(i==j)  
            cout<<endl; 
        }
         
    }
}