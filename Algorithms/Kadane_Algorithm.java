public class Kadane_Algorithm {
    public static void main(String[] args){
        int[] arr = {-2,-1,-3,-4,6,58};
        Solution solution = new Solution();
        int result = solution.maxSubarraySum(arr);
        System.out.println("The maximum number is : "+result);
    }

}
class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int max_Current = arr[0];
        int max_Global = arr[0];
        int n = arr.length;
        for(int  i = 1;i<n;i++){
            max_Current  = Math.max(arr[i],max_Current+arr[i]);
            max_Global = Math.max(max_Current , max_Global);
        }
        return max_Global;
    }
}

