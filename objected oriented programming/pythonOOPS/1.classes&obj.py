   #   OBJECT ORIENTED PROGRAMMING UNING PYTHON 
''' classes are knows as blueprints for creating an object 
        every object will have attributes and behavior 
        attributes you can imagine them as data 
        behaviours means running (actions done by objects) 
        Functions in oops are called methods 
              FOR EXAMPLE MOBLIE DESIGN BLUE PRINT IS CLASS
              PRODUCTS FOR MANFACTURING MOBILE LIKE CAMERA SCREEN 
               ARE THE " OBJECTS"  
               *** camera is a object its behavior is capturing 
               ***  screen is a object its behavior is displaying
                               ''' 


# creating a class  

class computer(): 
    def config(self):     # function in oops are methods 
        print("i5, 8gb , 1tb")  

com1 = computer()    # object is created 
com2 = computer()    # second object belongs to computer class 

com1.config()     # calling function 
com2.config()       # by using objects we are calling the function , function is a method



