// 1. Two Sum
// https://leetcode.com/problems/two-sum/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // O(n^2) Solution.
        
        // int output[] = new int[2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             output[0] = i;
        //             output[1] = j;
        //         }
        //     }
        // }
        // return output;
        
        // O(n) Solution.
        
        int output[] = new int[2];
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            
            if(map.containsKey(target - nums[i])){
                output[1] = i;
                output[0] = map.get(target - nums[i]);
                return output;
            }
            
            map.put(nums[i], i);
        }
        return output;
    }
}
