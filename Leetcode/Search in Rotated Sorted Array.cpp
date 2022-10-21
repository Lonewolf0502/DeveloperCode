#include <bits/stdc++.h>
using namespace std;

// Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    int findMin(vector<int>& nums) {
        if (nums.size() == 1) return 0;
        if (nums[nums.size()-1] > nums[0]) return 0;
        
        int l=0,r=nums.size()-1,mid;
        while (l<r) {
            mid = (l+r)/2;
            if (mid > 0 && nums[mid] < nums[mid-1]) return mid;
            if (mid < nums.size() - 1 && nums[mid+1] < nums[mid]) return mid+1;
            
            if (nums[mid] > nums[0]) l = mid+1;
            else r = mid-1;
        }
        
        return l;
    }
    int binSearch(vector<int>& nums,int l, int r, int target) {
        while (l<=r) {
            int mid = (l+r)/2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
public:
    int search(vector<int>& nums, int target) {
        int min = findMin(nums);
        if (target < nums[min] || (min > 0 && target > nums[min-1])) return -1;

        if (min == 0) return binSearch(nums,0,nums.size()-1,target);
        if (target >= nums[0]) return binSearch(nums,0,min-1,target);
        return binSearch(nums,min,nums.size()-1,target);
    }
};