// Author: vrintle

class Solution {
public:
    int trap(vector<int>& a) {
        int n = a.size();
        vector<int> pfx(n + 1), sfx(n + 1);
        for(int i = 0; i < n; i++) {
            pfx[i + 1] = max(a[i], pfx[i]);
        }
        for(int i = n - 1; i >= 0; i--) {
            sfx[i] = max(a[i], sfx[i + 1]);
        }
        int ans = -accumulate(a.begin(), a.end(), 0);
        for(int i = 0; i < n; i++) {
            ans += min(pfx[i + 1], sfx[i]);
        }
        return ans;
    }
};
