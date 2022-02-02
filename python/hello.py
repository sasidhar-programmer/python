# from abc import ABC, abstractmethod 
# import abc 
# class abstract(ABC) : 

#     def __init__(self) : 
#         print("from abstract class") 


#     @abstractmethod
#     def abcmethod(self) : 
#         print("yes") 

    
# class base(abstract) : 

#     def __init__(self) : 
#         abstract.__init__(self)  

#     def abcmethod(self): 
#         print("from base class") 
#         super().abcmethod() 


# b = base() 
# b.abcmethod() 

# print(b.__dict__) 



class one : 

    instants = 45 

    def __init__(self) : 
        print("from clas one") 

    def override(self, a : int, b : int) : 
        res = a + b 
        print(res) 

    


class two(one): 

    def __init__(self): 
        super().__init__() 

    def override(self): 
        print("from child class") 
        super().override(5, 6)



t = two() 
t.override() 


