var user = {  

    FirstName : "SASIDHAR", 
    LastName : "PURUM", 
    Role : "user", 
    isLoggedInCount : 45,  
    
    courseCount : [],  


    // info method 

    info : function() {   

        return `
            Name                      : ${this.FirstName +" "+ this.LastName}  
            Role                       : ${this.Role}
            NumberOfloggedIN times     : ${this.isLoggedInCount} 
            ${this.getCourserCount()}  `   

    }, 




    buycourse  : function(courseName)  { 
        this.courseCount.push(courseName); 
    }  , 

    getCourserCount : function() { 
        return `${this.FirstName} has logged in ${this.courseCount.length} courses` ; 

    } , 

};   


console.log(user.info()); 

