#include<iostream>
using namespace std; 


int main() { 
    /*

    A pointer however, is a variable that stores the memory address as its value.
    A pointer variable points to a data type (like int or string) of the same type, 
    and is created with the * operator.
    The address of the variable you're working with is assigned to the pointer:


    */ 
string food = "Pizza";  // A food variable of type string
string* ptr = &food;    // A pointer variable, with the name ptr, that stores the address of food

// Output the value of food (Pizza)
cout << food << "\n";

// Output the memory address of food (0x6dfed4)
cout << &food << "\n";

// Output the memory address of food with the pointer (0x6dfed4)
cout << ptr << "\n";


string name = "sasidhar"; 
string* pff = &name; 

cout << name << endl; 
cout << &name << endl; 
cout << pff << endl; 

double k = 45.678; 
double* kp = &k; 

cout<< k << endl; 
cout << kp << endl;  
cout << *kp << endl; // deference operator 

// modifing pointer 

*kp = 33.90; 
cout << k << endl; 
cout << *kp << endl; 
cout << kp << endl; 


    return 0 ; 
}