class insort { 

    void insetsort(int arr[], int size) { 

        for(int i = 1 ; i< arr.length; i++) { 

            for(int j = 1; j > 0; j--) { 

                if(arr[j] < arr[j-1]) { 

                    int temp = arr[j]; 
                    arr[j] = arr[j-1]; 
                    arr[j-1] = temp; 
                }
            }
        }
    }
}


public class insertionsort { 
    public static void main(String[] args) { 

        int arr[] = { 34,67908, 45, 40, 32, 9, 1};  

        insort sort = new insort(); 

        sort.insetsort(arr, arr.length); 

        for(int i = 0; i<arr.length; i++) { 
            System.out.print(arr[i] + ",") ; 
        }

        
    }
    
}

