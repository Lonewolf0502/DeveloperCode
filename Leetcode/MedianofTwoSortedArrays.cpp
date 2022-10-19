class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int>temp;
        if(nums1.size()>=1){
           for(int i=0;i<nums1.size();i++){
            temp.push_back(nums1[i]);
          } 
        }
        
        if(nums2.size()>=1){
           for(int i=0;i<nums2.size();i++){
            temp.push_back(nums2[i]);
          } 
        }
        
        sort(temp.begin(),temp.end());
        double s=0;
        double e=temp.size()-1;;
        int mid=(s+e)/2;
        double d=((double)temp[mid]+(double)temp[mid+1])/2;
        if(temp.size()>1){
            if(temp.size()%2==0){
            return d;
        }
        else
            return temp[mid];
        }
        
        else{
            return temp[0];
        }
    }
};