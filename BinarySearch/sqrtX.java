//Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

class Solution {
    int floorSqrt(int n) {
        // code here
        if(n==1){
            return n;
        }
        int start  = 1;
        int end = n;
        int ans = 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int sq = mid*mid;
            if(sq == n){
                return mid;
            }
            else if (sq < n){
                ans  = mid;
                  start = mid+1;
                
                
            }
            else{
                end = mid-1;
              
            }
        }
        return ans;
    }
}


class sqrtX {
    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.floorSqrt(11);
        System.out.println("SquarerRoot answer is : " +ans);
    }
