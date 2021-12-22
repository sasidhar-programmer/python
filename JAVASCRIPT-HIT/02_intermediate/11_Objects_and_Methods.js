

var user = { 
    FirstName : "SASIDHAR", 
    LastName : "PURUM", 
    Role : "user", 
    isLoggedInCount : 45, 
    
    courseCount : [], 
    buycourse  : function(courseName)  { 
        this.courseCount.push(courseName); 
    }  , 

    getCourserCount : function() { 
        return `${this.FirstName} has logged in ${this.courseCount.length} courses` ; 

    } , 

};  

var courseCount = false; 

console.log(user.FirstName); 
console.log(user.getCourserCount()); 

user.buycourse('Machine Learning');  
user.buycourse("Data Science"); 

console.log(user.getCourserCount()); 


