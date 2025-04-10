

class Main {
    public static void main(String[] args) {
       Solution s = new Solution();
       System.out.println(s.seriesSum(5));
    }
}

class Solution {
    public static int seriesSum(int n) {
        
        if(n==1){
            return 1;
            
        }
         return n+seriesSum(n-1);
    }
}
