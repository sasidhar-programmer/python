// creating the objects using function 


var User = function(FirstName, CourseCount) {  
    this.FirstName = FirstName; 
    this.CourseCount = CourseCount ; 

    this.GetCourseCount = function() {  
        console.log(`Course Count is ${this.CourseCount}`);  
        
    } 

}  
// we can use proto in order to get details of user

User.prototype.getFirstName = function() { 
    console.log(`User Name is ${this.FirstName}`); 
    
} 




// Create objects 

var Siri = new User("Sirisha", 6)  ; 

//console.log(Siri);   
Siri.GetCourseCount() ; 
Siri.getFirstName()  ;

var Ganesh = new User("Ganesh", 7) ; 
//console.log(Ganesh); 

Ganesh.GetCourseCount() ; 
Ganesh.getFirstName() ;



