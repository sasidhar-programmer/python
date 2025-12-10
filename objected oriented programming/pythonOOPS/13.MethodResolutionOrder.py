class A : 

    def __init__(self, a ,b ): 
        print(f"in a class {a} {b}") 

    def feature1(self, c, d): 

        print(f"in a feature 1 {c} {d} ") 


class B(A): 

    def __init__(self): 
        super().__init__(3,5) # calling the A class __init__ () method 
        print('b class') 

    def featrue1(self):  
        super().feature1(7 ,8) # calling the A class feature1 () method
        print('b class feature 2')  
        super().feature1(9,10) # calling the A class feature1 () method


cons = B()  
cons.featrue1() 

