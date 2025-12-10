# inner classes 

class Students2 : 

    def __init__(self, name, ids): 
        self.name = name 
        self.ids = ids   
        self.lap = self.Laptop("hp", 'i5') # object of inner class 

    def details(self): 
        print(self.name, self.ids)  
        self.lap.details() # calling details method of inner calls 


    class Laptop: 

        def __init__(self, company, processer): 
            self.company = company 
            self.processer = processer  

        def details(self) : 
            print(self.company, self.processer) 




Sasidhar = Students2("sasidhar.p", 94)  

Sasidhar.details() 





