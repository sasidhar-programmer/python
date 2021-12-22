// scope chaining 



var name = "sirisha"; 

console.log(name); 


function say_name() { 
    console.log(`at 11th line ${name}`);   

    say_name2(); 

    function say_name2() {  
        var name = "Ganesh" ;   // it has it's own name so it prints this name 
        console.log(`at 14 line ${name}`);
        
    }
    
}

say_name();  
