// A simple login form  
//   interpolation in js 

const ID = "aa101"; // const means constant we can't change it  

var first_name = 'Purum'; 
var last_name = 'Sasidhar'; 

var emain_id = 'sasidharpurum@gmail.com'; 
var password = 1234567;  

var country = 'India'; 
var state = "AndhraPradesh"; 


var is_logged_in_from_faceboom = false; 
var is_logged_in_from_google = false;  

var course_count = 0; 



console.log(first_name) ; 
console.log(last_name) ; 
// another way   
console.log("Your country : " + country);  
console.log("your state   : " , state);  
console.log("-----------------------------------------------")
// interpolation 

console.log(`  

  Your Id      :  ${ID} 
  firstname    :  ${first_name} 
  last_name    :  ${last_name} 

  email_id     :  ${emain_id} 
  country      :  ${country} 
  state        :  ${state} 
  coursercount :  ${course_count} 

`)