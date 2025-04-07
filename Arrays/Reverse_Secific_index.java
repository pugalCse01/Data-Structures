
import java.util.*;
class Reverse_Secific_index {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,0};
       int n = arr.length;
       int start = 5;
       int end = n-1;
       while(start<end){
           int temp = arr[start];
           arr[start] =arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
       System.out.println("Reversed array is "+ Arrays.toString(arr));
    }
}
