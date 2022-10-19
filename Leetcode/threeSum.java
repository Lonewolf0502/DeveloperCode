//Problem Statement: Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero.
// In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and
// their sum is equal to zero.
//https://leetcode.com/problems/3sum/

import java.util.*;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int lo=i+1,hi=nums.length-1,sum=0-nums[i];
                while(lo<hi){
                    if(nums[lo]+nums[hi]==sum){
                        res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));

                        while(lo<hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo<hi && nums[lo] == nums[hi-1]) hi--;

                        lo++; hi--;
                    }
                    else if(nums[lo]+nums[hi]<sum) lo++;

                    else hi--;
                }
            }

        }
        return res;
    }
}
