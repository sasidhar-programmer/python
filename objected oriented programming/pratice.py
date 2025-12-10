

class SGDC : 

    def __init__(self, name : str, id : int, group: str) -> None:
        
        self._name = name
        self._id = id
        self._group = group 
        self.__groups = ["bsc, bcom, bba"]
        

    @property
    def name(self):
        return self._name

    @property
    def id(self):
        return self._id
    
    @property
    def group(self):
        return self._group

    @name.setter
    def name(self, name): 
        if len(name) > 10 : 
            raise Exception("Name is too long")
        
        self._name = name

    @group.setter 
    def group(self, group): 
        if group not in self.__groups:
            raise Exception("Group is not valid")
        self._group = group


    # def __repr__(self) -> str:
    #     return f"{self.name} {self.id} {self.group}"

    def __str__(self) -> str:
        return f"{self.name} {self.id} {self.group}"


obj = SGDC("sasidhar",67, "bc") 
print(obj)






        