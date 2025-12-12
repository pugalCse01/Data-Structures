

class powerOfThree {
    public static void main(String[] args) {
    int num  = 22;
    
    Solution s = new Solution();
    boolean ans  = s.findpow(num);
    System.out.print(ans);
    }
}
class Solution{
    public boolean findpow(int n){
       if(n==1){
            return true;
        }
        if(n<=0||n%3 !=0){
        return false;}
        return findpow(n/3);
    }
}
