class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
         sort(nums.begin(),nums.end());
        int n=nums.size();
        vector<vector<int>>ans;
        set<vector<int>>s;
       //for a we need 3 elements so we have o left space for 3 elemnets
        for(int i=0;i<n-3;i++){
            if(i==0 || (long long)nums[i]!=(long long)nums[i-1])
            {
            //for b we need 2 spaces 
                for(int j=i+1;j<n-2;j++){
                    if(j==i+1 || (long long)nums[j]!=(long long)nums[j-1]){
                        //for c and d
                        long long int sum=target-(long long)nums[i]-(long long)nums[j];//a+b+c+d=tr  sum=tr-a-b
                        int lo=j+1;
                        int hi=n-1;
                        while(lo<hi){
                            if((long long)nums[lo]+(long long)nums[hi]==sum){
                                vector<int>temp;
                                temp.push_back((long long)nums[i]);//a
                                temp.push_back((long long)nums[j]);//b
                                temp.push_back((long long)nums[lo]);//c
                                temp.push_back((long long)nums[hi]);//d
                                if(s.find(temp)==s.end()){
                                    s.insert(temp);
                                    ans.push_back(temp);
                                }
                                  while(lo<hi && (long long)nums[lo]==(long long)nums[lo+1])lo++;
                            while(lo<hi && (long long)nums[hi]==(long long)nums[hi-1])hi--;
                                lo++;
                                hi--;
                            }
                                else
                                    if((long long)nums[lo]+(long long)nums[hi]>sum)
                                        hi--;
                                else
                                    lo++;
                          }
                    }
                }
            }
        }
        return ans;
    }
};