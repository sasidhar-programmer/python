// objects are core for java script 


var mobile = { 
    Name : "Note 5 pro", 
    ReleasedYear : 2018, 
    Processer : "SnapDragon632", 
    Camera :  "dual 20 + 2 megapixcel camera", 
    CargingType : "USB not type c" , 
    AndroidVersion  : "Oreo"
} 

console.log(mobile.ReleasedYear); // prefered way 

console.log(mobile["Processer"]);  

// we can  also modified values 

console.log(mobile.AndroidVersion);

mobile.AndroidVersion = "Android Pie" ; 

console.log(mobile.AndroidVersion);  

// for displaying the whole object we can also console.log () 

console.table(mobile);  // it gives tabular form 




