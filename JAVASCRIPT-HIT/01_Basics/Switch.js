// switch case in javascript 

var user = "user"; 

switch (user) {
    case "admin": 
        console.log("have full access to website"); 
        break;
        
    case "subadmin": 
        console.log("have some access to settings"); 
        break; 

    case "tester": 
        console.log("have access to modifi test"); 
        break; 

    case "user": 
        console.log("have access to content"); 
        break; 

    default: 
        console.log("no match found");
        break;
} 

