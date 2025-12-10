


def hello_fun(func) :

    def inner1() : 

        print("hello inside inner") 

        func() 

        print("this is last line of inner1 function") 


    return inner1

@hello_fun 
def pass_fun() : 

    print("function is as param to another")  


pass_fun() 

