class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        int INF = amount + 1;

        // dp[c]：恰好凑出金额 c 的最少硬币数
        vector<int> dp(amount + 1, INF);
        dp[0] = 0;

        for (int coin : coins) {
            // 完全背包，金额正序遍历
            for (int c = coin; c <= amount; ++c) {
                dp[c] = min(dp[c], dp[c - coin] + 1);
            }
        }

        return dp[amount] == INF ? -1 : dp[amount];
    }
};