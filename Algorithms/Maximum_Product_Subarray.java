// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Maximum_Product_Subarray  {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        
        Solution s = new Solution();
        int result  = s.maxProduct(arr);
        System.out.println(result);
    }
}
class Solution {
    int maxProduct(int[] arr) {
        int max_current = arr[0];
       int  min_current = arr[0];
        int max_global  = arr[0];
        for(int i = 1;i<arr.length;i++){
            int temp = max_current;
            max_current = Math.max(arr[i],Math.max(max_current*arr[i],min_current*arr[i]));
            min_current = Math.min(arr[i],Math.min(temp*arr[i],min_current*arr[i]));
            max_global = Math.max(max_global,max_current);
        }
        return max_global;
    }
}
