class Factorial {
    public static void main(String[] args) {
        int r = fact(5);
        System.out.println(r);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
