class Solution {
private:
    vector<vector<int>> result;
    vector<int> path;
    void backtrack(int start,const vector<int>& candidates,int target)
    {
        if(target==0)
        {
            result.push_back(path);
            return;
        }
        for(int i=start;i<candidates.size();i++)
        {
            if(candidates[i]>target) continue;
            path.push_back(candidates[i]);
            backtrack(i,candidates,target-candidates[i]);
            path.pop_back();
        }
    }
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        result.clear();
        path.clear();
        backtrack(0, candidates, target);
        return result;
    }
};