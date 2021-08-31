public class JaggedArrays { 
    public static void main(String[] args) {
        

       // int arr[][] = new int[4][4]; 
       // arr[0][5] = 56; 

        int arr2[][] =  {    {1,2,3}, 
                            {4,5},       // jagged arrays the size of rows may different
                            {45,89, 3,1}

                        };  

        for(int i = 0; i<arr2.length; i++) { 

            for(int j = 0; j<arr2[i].length; j++) { 
                
                System.out.print(" " + arr2[i][j]);
            } 
            System.out.println(""); 
        }

    }
    
}