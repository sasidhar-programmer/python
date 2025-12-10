

class Private : 
    def __init__(self, a : int, b:int) : 
        self.__a = self.__b = a, b

    @property 
    def a(self) :  
        return self.__a 

    @property 
    def b(self) : 
        return self.__b 

    @a.setter 
    def a(self, a) :
        if a > 45: 
            self.__a = a 
        else : 
            raise Exception("a is not valid")

    @b.setter 
    def b(self, b) :
        if b < 45 : 
            self.__b = b
        else : 
            raise Exception("b is not valid")

    def get_info(self) -> tuple : 
        return (self.a, self.b) 



pr = Private(10, 20)
print(pr.get_info())
pr.a = 30
print(pr.get_info())




    