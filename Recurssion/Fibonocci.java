

class  Fibonocci{
    public static void main(String[] args) {
        int result = fib(4);
        System.out.println(result);
    }
    static int fib(int n){
        if (n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            return fib(n-2)+fib(n-1);
        }
    }
}
