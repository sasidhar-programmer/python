public class OnedArray { 
    public static void main(String[] args) {
        
        int nums[] = {33, 56, 37, 45, 90};   
        // alternative 
        int second[] = new int[5]; 
        second[2] = 45; 
        System.out.println(second[2]); 


        for(int i=0; i < nums.length; i++) {  
 
            System.out.println(Math.pow(nums[i], 3)); 
        }


    }
}