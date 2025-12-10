class Student: 

    def __init__(self,name,id): 
        self.name = name 
        self.id = id 

    def display(self): 
        print('Hello', self.name) 
        print("id", self.id)  

        

st1 = Student("sasi", 90)   
st = Student("siri" , 94) 

st1.display() 
st.display() 




        