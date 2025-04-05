

class Names_n times {
    public static void main(String[] args) {
        printGfg(7);
       
    }
         public static void printGfg(int N) {
        // code here
        if(N<1){
            return ;
        }
        else{
            System.out.print("Your name ");
            printGfg(N-1);
        }
    }
}
