class Solution {
public:
    
    //comparison if frequency is same then sort in decreasing order.
    static bool cmp(pair<int,int>&a, pair<int,int>&b) {
        return  (a.second==b.second) ? a.first>b.first : a.second<b.second;
    }
    
    
    vector<int> frequencySort(vector<int>& nums) {
        if(nums.size()==1) 
            return nums;
        //First of all created map and stored its value and frequency.
        map<int,int> mpp;
        for(int i=0;i<nums.size();i++) 
        {
            mpp[nums[i]]++;
        }
        
        //Now created vector becuase we have to sort based on comparison
        vector<pair<int,int>> val;
        for(auto m : mpp) 
        {
            val.push_back(m);
        }
        sort(val.begin(),val.end(),cmp);
        //now store the result according to the frequency.
        vector<int> ans;
        for(auto v : val) {
            for(int i=0;i<v.second;i++) {
                ans.push_back(v.first);
            }
        }
        return ans;
    }
};