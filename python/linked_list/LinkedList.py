
class Node : 
    def __init__(self, val) : 
        self.val = val 
        self.next = None 
        


class LinkedList : 

    def __init__(self) : 
        self.head = self.tail = None 

    def is_head_none(self) : 
        if self.head is None : 
            return True 

    def append(self, val) : 
        if self.is_head_none() : 
            self.head = self.tail = Node(val) 
            return 

        self.tail.next = Node(val) 
        self.tail = self.tail.next 

    def add_with_list(self, lis : list ) : 
        for i in lis: 
            self.append(i) 

    def prepand(self, val) : 
        if self.is_head_none(): 
            self.head = self.tail = Node(val) 
            return 

        self.temp = Node(val)  
        self.temp.next = self.head 
        self.head = self.temp 

    def get_size(self) : 
        self.start = self.head 
        self.val = 0 
        while self.start : 
            self.val += 1 
            self.start = self.start.next 

        return self.val 

    def insert_node(self, pos : int , val) : 

        if pos == 0 : 
            self.prepand(val) 
        elif pos > self.get_size() : 
            self.append(val) 
        else : 
            self.slow = None 
            self.fast = self.head 
            for i in range(pos) : 
                self.slow = self.fast  
                self.fast = self.fast.next 
            
            self.new_node = Node(val) 
            self.slow.next = self.new_node 
            self.new_node.next = self.fast 

    
    def reverse_list(self) : 

        self.rev_list = LinkedList() 
        self.start = self.head 
        while self.start : 
            self.rev_list.prepand(self.start.val) 
            self.start = self.start.next 

        return self.rev_list 
        


    def delete_node(self, val) : 

        if self.is_head_none(): 
            return 
        elif val == self.head.val : 
            self.temp = self.head
            self.head = self.temp.next 
            return self.temp.val 
        elif self.tail.val == val : 
            self.prev = self.head 
            self.fast = self.head.next 

            while self.fast.next is not None : 
                self.prev = self.prev.next 
                self.fast = self.fast.next 

            self.tail = self.prev 

        else : 
            self.prev = None 
            self.fast = self.head

            while self.fast.next is not None : 

                if self.fast.val == val: 
                    self.temp = self.fast 
                    self.prev.next = self.fast.next 
                    return self.temp.val  

                self.prev = self.fast  
                self.fast = self.fast.next 
            

    def traverse(self): 
        self.start = self.head 
        self.vals = [] 
        while self.start : 
            self.vals.append(self.start.val) 
            self.start = self.start.next  

        return self.vals 

    def head_and_tail_val(self) : 
        print("head value : ", self.head.val) 
        print("tail value : ", self.tail.val) 

    







