//Problem Link:- https://leetcode.com/problems/squares-of-a-sorted-array/

//Solution Of the Problem:

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        for(int j=1;j<nums.length;j++){
            int key = nums[j];
            int k=j-1;
            
            while(k>=0 && nums[k]>key){
                nums[k+1] = nums[k];
                k=k-1;
            }
            nums[k+1] = key;
        }
        return nums;
    }
}