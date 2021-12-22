class info { 
    // constructor() is used to define constructor   

    constructor(name, age) { 
        this.name = name; 
        this.age = age; 

    } 
    // methods  similar to function 
    info_getter() { 
        return this.name + " "+ this.age;  

    }
    info_setter(name, age)  { 
        this.name = name; 
        this.age = age; 
        
    }

}

// creating objects like in java 
var my_info = new info("jarvis", "21"); 

console.log(my_info);
console.log(my_info.info_getter()); 
my_info.info_setter("zzzz", 20); 
console.log(my_info.info_getter()); 

// inheritance   in javascript 

class info_2 extends info { 
    constructor(city, district,name, age) { 

        // parent class constructor calling usng super(); 
        super(name, age); 
        this.city = city; 
        this.district = district; 
    } 
    
    user_infi() { 
        return this.info_getter() + " " + this.city + " " +  this.district 
    }
     
    // set is key word 
    set name_age(name) { 
        this.name = name; 
         
    }
}


var details = new info_2("madanapalli", "chittoor", "jarvis" , 20); 


console.log(details.user_infi()); 

details.name_age = "aaaa" ;

console.log(details.user_infi()); 

