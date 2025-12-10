class D: 

    def __init__(self): 
       

        print("in class D init")  
        super().__init__()  # class E class init()



class E: 

    def __init__(self): 
        print("in class E init") 


class F(D,E):  

    def __init__(self):  
        super().__init__() 
        print("in class F init") 


cons2 = F() 

