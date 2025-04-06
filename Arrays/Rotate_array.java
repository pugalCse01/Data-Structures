
import java.util.*;
class Rotate_array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        rotateArr(arr,d);
        System.out.print(Arrays.toString(arr));
        
    }
     static void rotateArr(int arr[], int d) {
        
        
        int n = arr.length;
         d = d%n;
        int[] temp = new int[n]; 
        int index = 0;
        for(int i = d;i<n;i++){
            temp[index++] = arr[i];
            
        }
        for(int i = 0;i<d;i++){
            temp[index++] = arr[i];
        }
        for (int i = 0;i<n;i++){
            arr[i] =temp[i];
        }
        
        
    }
}
