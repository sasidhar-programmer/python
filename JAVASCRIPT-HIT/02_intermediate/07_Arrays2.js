// Arrow functions 

// insted of writing function here we can use this 
var is_even =  (element) => { 
    // if(element % 2 === 0) { 
    //     return true; 
    // }  
      //else { return false;  } 

    return element % 2 === 0; 
} 

console.log(is_even(87));  

// every method 
// every method goes each element in array and performs the calcuation 
// it returns true all the elements are true. If not it returns false  

var res = [2,7,6,8,].every(is_even);   

//console.log(res);  

// using the call back function 

var res = [2,7,68,88,90].every( (e) => { return e % 2 ===0 }  );

//console.log(res);   


// with out return key word 

var ress = [2,4,63,8].every( (e) => (e % 2 === 0) )  

console.log(ress)
                                     

