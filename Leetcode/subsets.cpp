// //My Approach for this problem :

// 1) For every (n), we have total 2^n subsets which are nothing but powerset
// 2) All subsets can be represented using binary representation where 0 means we don't consider the digit and 1 means consider that digit


// Brute Force Approach 

class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> ans;
        for(int i = 0; i < (1<<n); i++) {
            vector<int> temp;
            for(int j = 0; j < n; j++) {
                if((1<<j) & i) {
                    temp.push_back(nums[j]);
                }
            }
            ans.push_back(temp);
            temp.clear();
        }
        return ans;

    }
};


