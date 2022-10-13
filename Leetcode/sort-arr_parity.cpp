class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& arr) {
        int i, j, len;
        i = 0; j = arr.size()-1;
        len = arr.size();
        while(i < j) {
            
            if(arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                swap(arr[i], arr[j]);  
            }
            if(arr[i] % 2 == 0) {
                i++;
            }
            if(arr[j] %  2 == 1) {
                j--;
            }
        }
        return arr;
    }
};