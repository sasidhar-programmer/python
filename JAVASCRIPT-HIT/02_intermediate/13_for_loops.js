/* var  populate =  new Array(); 


for(var i = 1; i <= 100; i++) { 
    populate.push(i); 
} 


for(let i = 0; i<populate.length; i++) { 
    console.log(populate[i])
}                                     */ 


var countries = [ 
                "Andhra Pradesh", 
                "Rajashtan", 
                "TamilNadu", 
                1945, 
                "kerala", 
                "karanataka" 
]
 

for(let i = 0; i<countries.length; i++) {   

    if(typeof countries[i] === "string") continue;  
    console.log(countries[i]); 

} 

