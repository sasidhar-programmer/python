/* this gives access to global context it is different here we are using node it gives 
    empty {} scope . 
    But is browser it may be different . 



*/ 

console.log(this);  


function hello() {  
    var name = 'sasidhar'; 
    console.log(this);
    
} 

hello(); 