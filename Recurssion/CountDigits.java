public class CountDigits {
    public static  void main(String[] args){
        int num = 1234567890;
        int ans = countnum(num);
        System.out.println("count is : "+ans);
    }
    public static  int countnum(int n){
       
        if(n==0){
            return 0;
        }
        return 1+countnum(n/10);


    }
}
