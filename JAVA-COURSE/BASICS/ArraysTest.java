import java.util.Scanner;

class MethodsOfArray {   

    int size = 5; 

    Scanner sc = new Scanner(System.in);  

    int arr1[] = new int[100];

    // enter the elements of array 

    public void getArray() {  
        System.out.println("enter your array elements"); 
        for(int i = 0; i<size; i++) {  

            arr1[i] = sc.nextInt(); 
        }

    }


    // method for printing array() 
    public void printArray() { 

        for(int i = 0; i<size; i++) { 

            System.out.print(arr1[i]+" "); 
        } 
        System.out.println("");

    } 

    //method for inserting element into array at specified position 
    public void insertKey(int pos, int key) { 
        for(int i = size; pos <= i ; i--)  {  
            arr1[i+1] =  arr1[i]; 
        } 
        arr1[pos] = key;
        size += 1;
    } 

    // method for delete element 
    public int delete(int pos) {  
        int temp = arr1[pos]; 

        System.out.println("deleted element : "+ temp);
        
        for(int i = pos; i<size; i++) { 
            arr1[i] = arr1[i+1];  

            
        } 
        size -= 1; 
        return temp;

    } 
    // method for search element 
    public void  search(int key) { 

        for(int i = 0; i<=size; i++) {
            if(arr1[i] == key)  System.out.println("element found at: " + i); 
            else    System.out.println("element not found");          
        } 

    }


}

public class ArraysTest { 
    public static void main(String[] args) {  

        // creating object 
        MethodsOfArray arr = new MethodsOfArray();  

        arr.getArray();
        
        arr.printArray();  // calling the print array method  
        arr.insertKey(5, 897); 
        arr.printArray(); 
        arr.delete(3); 
        arr.printArray(); 
        arr.search(5); 
        
        
    } 
    
} 

