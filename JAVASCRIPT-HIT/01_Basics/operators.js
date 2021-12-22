// operators in js   (+ - * / % ) 

var sellingPrice = 199; 
var ListPrice = 799; 

var Discount =  ((ListPrice - sellingPrice) / ListPrice ) * 100 ; 

console.log("discount " + Discount) ;  

var Discount = Math.round(((ListPrice - sellingPrice) / ListPrice) * 100) ; 

console.log("Discount Price " + Discount + "% off") ; 


console.log(ListPrice < sellingPrice);  

var render = sellingPrice > ListPrice ;  

console.log(typeof render);     