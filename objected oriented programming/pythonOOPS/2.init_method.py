# __init__ calls the variable automatically with out calling the function 

class computer(): 

    def __init__(self, cpu, ram): 
        self.cpu = cpu 
        self.ram = ram 
        #print(self.cpu, self.ram) 

    def config(self): 
        print("config is", self.cpu, self.ram)  


com1 = computer('i5', 16) 
com2 = computer('rezyn', 8)  

com1.config() 
com2.config()  
