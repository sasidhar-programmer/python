
import LinkedList as liss


lis = liss.LinkedList()
lis.add_with_list([i for i in range(10)])

print(*lis.traverse()) 
lis.head_and_tail_val() 

print("prepending the value")
lis.prepand(809) 
lis.head_and_tail_val()
print(*lis.traverse()) 

print("deleting the head value") 
lis.delete_node(809) 
lis.head_and_tail_val() 

print(" deleted value", lis.delete_node(5))
print(*lis.traverse()) 
 
lis.head_and_tail_val() 

lis.insert_node(8, 555) 
print(*lis.traverse()) 

rev_lis = lis.reverse_list() 
print(*rev_lis.traverse()) 
rev_lis.head_and_tail_val() 
