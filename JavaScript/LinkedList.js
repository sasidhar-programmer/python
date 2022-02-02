

class Node { 
    constructor(value) { 

        this.value = value 
        this.next = null; 

    }
}

class linkedlist { 

    constuctor() { 
        this.head = null;
        this.tail = null; 
        
    }

    append(val) { 
        if(this.head == null) { 
            this.head = new Node(val) ; 
            this.tail = this.head; 
            return ;

        } 

        this.tail.next = new Node(val); 
        this.tail = this.tail.next;
    } 

    prepand(val) { 
        if(this.head == null)  { 
            this.head = new Node(val) ;
            this.tail = this.head ;
            return ; 
        } 

        var temp = new Node(val) 
        temp.next = this.head 
        this.head = temp 
    }

    traverse() { 
        var start = this.head ; 
        var arr = []; 
        while(start) { 
            arr.push(start.value); 
            start = start.next ; 
        } 
        return arr; 
    }
} 

let ls = new linkedlist() ;

for(var i = 1; i<=10; i++) { 
    ls.append(i); 
}

console.log(ls.traverse()); 
ls.prepand(899); 
console.log(ls.traverse()); 
//console.table(ls) ; 



