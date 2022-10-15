// Java question with proper link 
// Leetcode - 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/


// Solution -

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    sum++;
                }
            }
        }
        return sum;
    }
}

