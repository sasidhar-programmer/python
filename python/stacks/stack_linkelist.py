

class Node : 
    def __init__(self, val) : 
        self.val = val 
        self.next = None 

    
class LinkedListStack : 

    def __init__(self) : 
        self.head  = None 
        self.num_elem = 0 

    def push(self, val) : 

        if self.head is None : 
            self.head = Node(val) 
            return 

        self.temp = Node(val) 
        self.temp.next = self.head 
        self.head = self.temp 

        self.num_elem += 1 

    def pop(self) : 

        if self.head is None : 
            print("stack is empty")  
            return 

        self.head = self.head.next 
        self.num_elem -= 1 

    def traverse(self) -> list : 
        self.lis = [] 
        self.start = self.head 
        while self.start : 
            self.lis.append(self.start.val) 
            self.start = self.start.next 

        return self.lis 


stk_linked = LinkedListStack()
for i in range(10) : 
    stk_linked.push(i) 

print(*stk_linked.traverse()) 

stk_linked.pop()
stk_linked.pop()

print(*stk_linked.traverse()) 
