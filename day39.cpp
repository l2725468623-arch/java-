class Solution {
private:
    vector<string> result;
    string path;
    void backtrack(int left,int right,int n)
    {
        if(path.size()==2*n)
        {
            result.push_back(path);
            return;
        }
        if(left<n)
        {
            path.push_back('(');
            backtrack(left+1,right,n);
            path.pop_back();
        }
        if(right<left)
        {
            path.push_back(')');
            backtrack(left,right+1,n);
            path.pop_back();
        }
    }
public:
    vector<string> generateParenthesis(int n) {
        result.clear();
        path.clear();
        backtrack(0, 0, n);
        return result;
    }
};