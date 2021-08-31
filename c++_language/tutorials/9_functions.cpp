#include<iostream> 
using namespace std;  

// function creation 

void fun() { 
    cout<<"I got exectued \n "; 
}

int square(int k) { 
 
    return k*k;  
}

void myname(string name = "sasidhar") { 

    cout<<name<<endl; 
}

int main() {  

    fun(); // calling the function  
    fun(); 
    fun(); 

    cout << square(56) << endl;  

    myname();  

    int store_value = square(3); 
    cout << store_value << endl; 

    return 0; 
}