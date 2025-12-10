class Student: 
    
    def __init__(self, name, id, gender): 
        self.name = name 
        self.id = id 
        self.gender = gender 

    def display(self): 
        print(self.name) 
        print(self.id) 
        print(self.gender) 

s1 = Student("sasidhar", 45, 'male')

# printing the attribute 
print(getattr(s1,'name')) 
 

print(setattr(s1,'id',90)) 
s1.display() 


print(hasattr(s1,'gender')) 

print(s1.__doc__) 
print(s1.__dict__) 
print(s1.__module__) 






