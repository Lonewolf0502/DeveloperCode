class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int temp = nums[0];
        for(int i = 1; i < nums.size(); i++) {
            nums[i] = nums[i] + temp;
            temp = nums[i];
        }
        return nums;
    }
};