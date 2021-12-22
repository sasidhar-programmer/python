
const red = document.querySelector(".red") ; 
const cyan = document.querySelector(".cyan")  ;
const violet = document.querySelector(".violet");  
const orange = document.querySelector(".orange") ;

const pink = document.querySelector(".pink")  ;


const center = document.querySelector(".center") ;


//console.log(window.getComputedStyle(red).backgroundColor); 


const getRGB = (search_element) => { 
    return window.getComputedStyle(search_element).backgroundColor ; 
} 


// const color = getRGB(orange);  


// orange.addEventListener("mouseenter", () => {
//     center.style.backgroundColor = color
// }); 


const MagicColorChanger = (element, color) => {
    return element.addEventListener("mouseenter", () => {
           center.style.backgroundColor = color
           });
} 

MagicColorChanger(red, getRGB(red)); 
MagicColorChanger(cyan, getRGB(cyan));  
MagicColorChanger(violet, getRGB(violet));  
MagicColorChanger(pink, getRGB(pink));  
MagicColorChanger(orange, getRGB(orange));  





