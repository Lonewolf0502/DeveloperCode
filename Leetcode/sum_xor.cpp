class Solution {
public:
   int subsetXORSum(vector<int>& nums) {
        ret = 0;
        dfs(nums, 0, 0);
        return ret;
    }
    
    void dfs(vector<int>& nums, int pos, int cur){
        if(pos == nums.size()){
            ret += cur;
            return;
        }
        dfs(nums, pos + 1, cur);
        dfs(nums, pos + 1, cur ^ nums[pos]);
    }
    
    int ret;
};