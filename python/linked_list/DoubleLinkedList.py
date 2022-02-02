
class DoubleNode : 

    def __init__(self, val) : 
        self.val = val 
        self.next = None 
        self.prev = None 


class DoubleLinkedList : 

    def __init__(self) : 
        self.head = self.tail = None 

    def is_head_none(self) -> bool: 
        if self.head is None : 
            return True 

    def append(self, val) -> None: 
        if self.is_head_none(): 
            self.head = self.tail = DoubleNode(val) 
            return 

        self.tail.next = DoubleNode(val) 
        self.tail.next.prev = self.tail 
        self.tail = self.tail.next 

        return 


    def traverse(self) -> list: 
        self.last = self.tail 
        self.vals = [] 
        while self.last : 
            self.vals.append(self.last.val) 
            self.last = self.last.prev 

        return self.vals 

    
dlis = DoubleLinkedList()
for i in range(5) : 
    dlis.append(i) 

print(*dlis.traverse()) 


        