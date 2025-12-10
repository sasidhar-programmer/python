class value: 

    def __init__(self, m1, m2): 
        self.m1 = m1 
        self.m2 = m2  

    # integer is built in class it knows what the operator + is 
    # here our value class don't know what is the + operator  we need to overload + add

    def __add__(self, other): 

        self.v1 = self.m1 + other.m1 
        self.v2 = self.m2 + other.m2 
        self.val3 = value(self.v1 , self.v2)  



val = value(20,20) 
val2 = value(30,30)  



