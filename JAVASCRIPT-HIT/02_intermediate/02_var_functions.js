// variable functions 


var getUserStatus = function(name, role) {  

    switch (role) {
        case 'admin': 
            return `hey ${name}. You have all access` 
            break; 

        case 'subAdmin': 
            return `hey ${name}. You have access to modifiy or delete courses`  
            break; 

        case 'testAdmin': 
            return `hey ${name}. You have access to modify test content`  
            break; 

        case 'user': 
            return `hey ${name}. You have access to content` 
            break;
    
        default: 
            return `hey ${name}. you have access to trail the content`
            break;
    }

} 


console.log(getUserStatus('sasidhar', 'subAdmin'));  

var userRole = getUserStatus('ganesh', 'admin') 
console.log(userRole); 
