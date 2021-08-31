/* 
Algoritham for selector sort 

selection_sort(A, N)  
this procedure sort elements in ascending order . A is an array of N elements . The 
variable i,j used to index the array elements 

1. [loop on index] 
     for i  = 1 to n-1 do 
        Begin 

2. min = i  initialize the  minimum index 

3. for j = i + 1 to N do 
4. begin  
     if a[j] < a[min] then 
         set min = j 
    end   

5. exchange elements 
       swap( a[i] , a[min]) 
     end 
    
6. return 

*/ 

class sel { 


    void selsort(int arr[], int size) {  

        for(int i = 0; i<size; i++) { 
            int min = i; 
            for(int j = i+1; j<size; j++) { 
                if(arr[j] < arr[min]) { 
                    min = j ; 
                } 
            } 
            int temp = arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp; 
        }

    }
}



public class selsort { 
    public static void main(String[] args) { 

        sel sort = new sel(); 

        int arr[] = {9, 8, 7, 4,2, 79, 75869 , 45, 1 ,4,4};   
        sort.selsort(arr, arr.length); 
        System.out.println("sorted array"); 
        for(int i = 0 ; i<arr.length; i++) { 
            System.out.print(arr[i] + ",") ; 
        }

        
    }
} 








