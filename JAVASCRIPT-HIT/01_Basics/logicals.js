// logical operators 



var is_logged_in = true; 
var is_email_verified = true; 
var card_info = true;  



// with out logical operators 

if(is_logged_in) { 
    console.log("Logged in successfull");  

    if(is_email_verified) { 
        console.log("you email is verified");  

        if(card_info) { 
            console.log("you can make purchases");  

        } else { 
            console.log("card details is not correct. please provide the right one"); 
        }

    } else { 
        console.log("your email is not verified. Please check it once"); 
    }
} 

// logical operators 

if (is_email_verified && is_logged_in && card_info) { 
    console.log("Details verified. You can make purchases") 
} else { 
    console.log("Error ! check your details once again") 
}