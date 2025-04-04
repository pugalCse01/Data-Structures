

class Print_1_To_N {
    public static void main(String[] args) {
        
        sol(5);
        
    }
    public static void sol(int n){
         if(n<1){
           return; 
        
        }
        else{
            sol(n-1);
            
            System.out.print(n+ " ");
            
            
            
        }
    }
    
}
