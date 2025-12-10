class Student(): 

    def __init__(self,name,age,grade): 
        self.name = name 
        self.age = age 
        self.grade = grade 

    def get_grade(self): 
        return self.grade 



class Course(): 

    def __init__(self, name, max_students): 
        self.name = name
        self.max_students = max_students 
        self.students = [] 

    def add_student(self, stud): 
        self.stud = stud 
        if len(self.students) < self.max_students: 
            self.students.append(self.stud)  
            return True 
        return False 


s1 = Student("Sasidhar", 20, "A+") 
s2 = Student("Sirisha", 20, "A++")  

cur = Course("Ai", 3) 
cur.add_student(s1) 








