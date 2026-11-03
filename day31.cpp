
class Solution {
public:
    int rob(vector<int>& nums) {
        int prev2 = 0;   // dp[i-2]
        int prev1 = 0;   // dp[i-1]
        for (int x : nums) {
            int cur = max(prev1, prev2 + x);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
};