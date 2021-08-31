#include<iostream>
using namespace std; 

class Laps { 

    string name; 
    int cost; 
    int ram; 
    
    public:
    Laps(string name , int cost, int ram) { 

        cout << name << endl; 
        cout << cost << endl; 
        cout << ram << endl; 
    } 

}; 



int main() {  

    Laps Hp("Hp_debz" , 50000, 8);   


    return 0; 
}