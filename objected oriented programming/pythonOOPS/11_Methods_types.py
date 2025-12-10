class students : 

    #class variables  
    school_name = 'abc_school' 

    def __init__(self, name, ids) :  
        self.name = name 
        self.id = ids 
       

    @classmethod
    def get_school(cls): 
        return cls.school_name  

    @staticmethod
    def stat(): 
        return "static method"




s1 = students('sasidhar', 94) 

print(s1.name, s1.id, students.school_name) 

print(students.get_school())


print(students.stat())
