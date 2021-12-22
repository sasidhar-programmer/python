var counter = document.querySelector(".counter") ; 
var followers = document.querySelector(".followers"); 


let count = 1 ; 

setInterval( () => { 
    if(count < 1000) { 
        count ++ ; 
        counter.innerText = count; 
        
        if(count === 998) { 
            setTimeout( () => {  

                followers.innerText = 'Hello Sirisha! :) \n @Ganesh Raju ' ;
                                    //author @ Ganesh Raju 
            }, 0); 
        }



    }
}, 0.1)  ; 




// setTimeout( () => {  

//     followers.innerText = 'Hello Ganesh ! :)' ;

// }, 0); 