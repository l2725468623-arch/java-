class Solution {
public:
    int numSquares(int n) {
        vector<int> dp(n + 1, n + 1);
        dp[0] = 0;

        // 枚举物品：1、4、9、16……
        for (int i = 1; i * i <= n; ++i) {
            int square = i * i;

            // 完全背包：容量正序遍历
            for (int c = square; c <= n; ++c) {
                dp[c] = min(dp[c], dp[c - square] + 1);
            }
        }

        return dp[n];
    }
};