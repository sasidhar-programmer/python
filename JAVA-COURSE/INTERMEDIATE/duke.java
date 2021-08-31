class checks { 

  public void ren(int arr[]) {  

    for(int i = 0 ; i<arr.length; i++) { 
      System.out.print(arr[i] + " "); 
    }

  }


}


class duke { 
  public static void main(String[] args) { 

    int[] arr = new int[5];  

    for(int i = 0; i < arr.length; i++) {  

      arr[i] = i * i; 

    } 
    for(int i = 0; i<arr.length; i++) { 
      System.out.print(arr[i] + " ") ; 
    }  

    System.out.println(" ")  ; 


    for(int i = arr.length - 1; i >= 0 ; i--) { 

      System.out.print(arr[i] + " "); 

    }    

    System.out.println("array printed through the parameter");

    checks c = new checks(); 
    c.ren(arr);   
    
    System.out.println("Array changed"); 
    for(int i = 0; i < arr.length; i++) {  

      arr[i] = i * 8; 

    } 
    c.ren(arr) ;  

  }

} 

