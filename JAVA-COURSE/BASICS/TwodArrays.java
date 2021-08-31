public class TwodArrays { 
    public static void main(String[] args) {
        

       // int arr[][] = new int[4][4]; 
       // arr[0][5] = 56; 

        int arr2[][] =  {    {1,2,3,4}, 
                            {4,5,6,7}, 
                            {45,89, 3,1}

                        };  

        // for(int i = 0; i<arr2.length; i++) { 

        //     for(int j = 0; j<arr2[i].length; j++) { 
                
        //         System.out.print(" " + arr2[i][j]);
        //     } 
        //     System.out.println(""); 
        // } 

        for(int i[] : arr2) { 
            for(int k : i) { 
                System.out.println(k); 
            }
        }

    }
    
}

