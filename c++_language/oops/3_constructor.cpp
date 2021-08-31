// constructor 


#include<iostream> 
using namespace std; 


class cons { 
    
    public: 
        cons() { 
            cout<< "constructor is called automatically when object is created" << endl; 
        }
};


int main() {  

    cons obj_cons; 


    return 0; 
}
