
#logical code for tic tac toe game 
# first thing we need to do is displaying the board    

board = ['-', '-', '-',
        '-', '-', '-',
        '-', '-', '-', ]  


def display_board(): 
    print(board[0] + " | "+board[1]+" | "+ board[2]) 
    print('-' * 10)
    print(board[3] + " | "+board[4]+" | "+ board[5])
    print('-' * 10)
    print(board[6] + " | "+board[7]+" | "+ board[8])  


display_board() 


class tic_tak_toe():


    def player_1(self): 
        self.position = int(input("A: Enter your input from 1 to 9:\n"))
        self.position -= 1 
        

    def player_2(self): 
        self.position_1 = int(input("B: Enter your position from 1 to 9:\n"))
        self.position_1 -= 1 

        

check_list = [] 
save_case = 666 # 666 is only for initilization it is not a value any code 

c = tic_tak_toe() 
for i in range(0,5): 

    if i == 0: 
        pass 
    else: 
        print(c.position) 
        save_case = c.position 

     
    c.player_1() 
    while c.position ==  save_case: 
        print("the block is already filled ") 
        c.player_1() 
    
    if i == 0: 
        pass 
    else: 
        for d in check_list: 
            if d == c.position: 
                print('the block is already filled') 
                c.player_1() 


    appen = c.position 
    check_list.append(appen) 
    print(check_list) 

    
    for pos in range(0,9): 
        if pos == c.position:
            board[pos] = 'X'
            display_board()
    
    if i == 4: 
        break


    c.player_2() 
    def checking(): 
        if c.position != c.position_1 : 
            for d in check_list: 
                if d == c.position_1: 
                    print('the block is already filled') 
                    c.player_2() 


            appen = c.position_1 
            check_list.append(appen) 
            print(check_list) 

        else: 
            print("the block is already filled ") 
            c.player_2()
            checking()
    checking() 

    for pos_1 in range(0,9): 
            if pos_1 == c.position_1:
                board[pos_1] = 'O' 
                display_board() 
    #print(c.position_1)  
    
