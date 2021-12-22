const web_sites = ['Google', 'Youtube', 'Netflix', 'Amazon', 'Coursera'];  

for(const n of web_sites) {   // used for arrays 
    console.log(n); 
    
} 


const Symbols = { 
    yt : 'Youtube', 
    ig : 'instagram', 
    fb : 'facebook', 
    cs : 'coursera' 
} 

for(const n in Symbols) { 
    console.log(`key is ${n} and value is ${Symbols[n]}`); 
} 



