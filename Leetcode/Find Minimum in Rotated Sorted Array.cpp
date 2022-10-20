#include <bits/stdc++.h>
using namespace std;

// Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
public:
    int findMin(vector<int>& nums) {
        if (nums.size() == 1) return nums[0];
        if (nums[nums.size()-1] > nums[0]) return nums[0];
        
        int l=0,r=nums.size()-1,mid;
        while (l<r) {
            mid = (l+r)/2;
            if (mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];
            if (mid < nums.size() - 1 && nums[mid+1] < nums[mid]) return nums[mid+1];
            
            if (nums[mid] > nums[0]) l = mid+1;
            else r = mid-1;
        }
        
        return nums[l];
    }
};