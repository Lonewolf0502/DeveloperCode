class Solution {
public:
    bool canFinish(int n, vector<vector<int>>& pre) {
        unordered_map<int, vector<int>> edges;
        vector<int> indegree(n, 0);
        for (auto i: pre) {
            indegree[i[0]] += 1;
            if (edges.count(i[1]) > 0) {
                edges[i[1]].push_back(i[0]);
            }
            else {
                vector<int> v;
                v.push_back(i[0]);
                edges[i[1]] = v;
            }
        }
        queue<int> sxx;
        for (int i = 0; i < n; i++) {
            if (indegree[i]==0) {
                sxx.push(i);
                indegree[i] = INT_MAX;
            }
        }
        while (sxx.size() > 0) {
            int ix = sxx.front();
            sxx.pop();
            for (auto i: edges[ix]) {
                indegree[i] -= 1;
                if (indegree[i] == 0) {
                    sxx.push(i);
                    indegree[i] = INT_MAX;
                }
            }
        }
        for (auto i: indegree) {
            if (i!=INT_MAX)
                return false;
        }
        return true;

    }
