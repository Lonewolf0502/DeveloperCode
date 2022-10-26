class Solution {
public:
    double check(vector<int> &p1, vector<int> &p2)
    {
        return sqrt((p2[0]-p1[0])*(p2[0]-p1[0]) + (p2[1]-p1[1]) * (p2[1]-p1[1]) );
    }
    
    bool validSquare(vector<int>& p1, vector<int>& p2, vector<int>& p3, vector<int>& p4) {
        vector<vector<int>> p = {p1,p2,p3,p4};
        set<double> st;
        
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                double res = check(p[i],p[j]);
                if(res!=0)
                {
                    st.insert(res);
                }
                else
                {
                    return false;
                }
            }
        }
        return st.size()==2;
    }
};
