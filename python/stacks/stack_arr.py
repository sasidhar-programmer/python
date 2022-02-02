



class Stack : 

    def __init__(self, initial_size) : 
        self.initial_size = initial_size 
        self.arr = [0 for _ in  range(self.initial_size)]  
        self.next_index = 0
        self.num_elem = 0 

    def push(self, elem) : 
        if self.next_index == len(self.arr): 
            print("Stack is full increasing the size of stack ... ")  
            for _ in range(self.initial_size) : 
                self.arr.append(0)
            
        self.arr[self.next_index] = elem 
        self.next_index += 1
        self.num_elem += 1  

    def pop(self) : 
        self.arr[self.next_index - 1] = 0 
        self.next_index -= 1
        self.num_elem  -= 1 

    

stk = Stack(10) 

for i in range(20) : 
    stk.push(i)


print(*stk.arr) 


stk.pop()
stk.pop()

print(*stk.arr) 
print(stk.next_index, stk.num_elem) 



    