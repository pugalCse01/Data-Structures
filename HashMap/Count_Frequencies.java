//for online practice : https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
import java.util.*;
class Solution {
   
    public List<Integer> frequencyCount(int[] arr) {
        int n  =arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =1 ; i<=n;i++){
            result.add(map.getOrDefault(i,0));
            
        }
        return result;   
        }    
    }
class Count_Frequencies {
    public static void main(String[] args) {
       int[] arr = {2,2,3,5,1};
       Solution s = new Solution();
       
        List<Integer> result = s.frequencyCount(arr);
         
             System.out.println(" Integer Value counts are : "+ result);
         
    }
}
