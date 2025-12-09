public class CountDigits {
    public static  void main(String[] args){
        int num = 1234567890;
        int ans = countnum(num);
        System.out.println("count is : "+ans);
    }
    public static  int countnum(int n){
        int count = 1;
        if(n==0){
            return 0;
        }
        return count+countnum(n/10);


    }
}
