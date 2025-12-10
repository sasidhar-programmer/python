   # there are two types of variable in the ooops conspect 
    # 1 static variables 
    # 2 instance variables 


# static variable are variables that effect all the objects these are declared
# under the class as shown below 

class car(): 
    wheel = 4   # static variables 

    def __init__(self):                
        self.milage = 10                  # these milage, company are instance variables 
        self.company = "lamborgini"       # these can able to change for every object 

    
c1 = car() 
c2 = car() 

c1.milage = 45     # see for c1 object milage is changed 

print(c1.milage,c1.company, car.wheel) 
print(c2.milage,c2.company) 


