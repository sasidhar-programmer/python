
class vs_code:  

    def execute(self):  

        print('running') 
        print('compiling') 

class intelij: 

    def execute(self): 

        print('for java') 
        print('i don\'t know about features') 




class Laptop:  

    def code(self, ide):  

        ide.execute()   # calling above class method 



ide = intelij()  
ide_2 = vs_code() 




editor = Laptop()   

editor.code(ide) 
editor.code(ide_2)



