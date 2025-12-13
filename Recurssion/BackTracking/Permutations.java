

import java.util.*;
class Permutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Solution s = new Solution();
    List<List<Integer>> answer = s.permute(arr);
    System.out.println(answer);
        
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums,result,0);

        return result;
        
        

        
    }
    public void permutation(int[] nums, List<List<Integer>> result,int index){
        if(index==nums.length){
             List<Integer> temp = new ArrayList<>();
            for (int n : nums) {
                temp.add(n);
            }
            result.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            permutation(nums,result,index+1);
            swap(nums,index,i);


        }
    }
    public void swap(int[] nums,int index,int i){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
