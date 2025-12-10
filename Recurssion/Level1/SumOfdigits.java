public class SumOfdigits {
    public  static  void  main(String[] args){
        int n = 282;
         int ans  = SumofNumbers(n);
         System.out.println("Answer is " +ans);

    }
    public  static int SumofNumbers(int n ){

        if(n==0){
            return 0;
        }
      return n%10+SumofNumbers(n/10);
    }
}
