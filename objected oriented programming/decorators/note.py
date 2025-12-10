

def function1(fun1) : 
    print("function1")  
    fun1() 

    def inner(a, b, c) : 

        print("function1_lopala_unna_inko_function_nundi_call_chastunamu")
        print(a+b+c) 

    return inner 


@function1 
def function2() : 
    print("function2") 



function2(2,3,4) 


print("___" * 56) 

def chek_args(*scalarvalues,  **kargs) :   

    print(type(kargs)) 
    print(type(scalarvalues)) 

    for i, j in kargs.items() : 
        print(i, "-", j) 

      



chek_args(1,2, one = "hello", b="jello")  