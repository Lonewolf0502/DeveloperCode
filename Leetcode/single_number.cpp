class Solution {
public:
    int singleNumber(vector<int>& nums) {
        //Whenever duplicates comes please try to think of XOR property.
        int result = 0;
        for(int i = 0; i < nums.size(); i++) {
            result = result ^ nums[i];
        }
        return result;
    }
};