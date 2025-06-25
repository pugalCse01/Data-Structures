
import java.util.*;
class  Smallest_Positive_Missing{
    public static void main(String[] args) {
       int[] arr = {2,2,-3,5,1};
       Solution s = new Solution();
       
        int result = s.missingNumber(arr);
         
             System.out.println(" Integer Value counts are : "+ result);
         
    }
}

class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        
       for(int num : arr){
           if(num>0){
               set.add(num);
           }
       }
       int i = 1;
       while(true){
           if(!set.contains(i)){
               return i;
           }
           i++;
       }
        
        
        
    }
}

