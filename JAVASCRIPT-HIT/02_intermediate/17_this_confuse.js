// for all regular function calls this refers to window object 



console.log(this); 


const test  = { 
    firstName : "sasidhar", 
    lastName  : "purum",  
    coursecount : 56, 

    getcourses : function() { 
        console.log("line 13", this); // here this refers to the object  


        function sayHello() { 
            console.log('line 18', this); // here it is a regular function this refer to window

        } 
        sayHello() 
        
    }

}  


test.getcourses() 

