Tipper(80);  // we can also call hear because function are regestered  in global context
             // varibale in global context are scanned and undefined 

function Tipper(a) {  

    var bill = parseInt(a); 
    var total = bill + 5; 
    console.log(total); 
    
} 
 

Tipper(45); 


console.log(name); // it gives undefined because variable are scanned and underdefine; 
var name = 'sasidhar';
// 

function Names(name) {     

    console.log(name); 
} 

Names("Gowtham"); 


console.log(name);  

//test() ;   gives error 

var test = function() {  

    console.log("function with variable also scanned and undefined");
    
} 

test(); // works 




