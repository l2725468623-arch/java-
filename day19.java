class Solution {
    public int maxSubArray(int[] nums) {

        int dp = nums[0];  // 当前最大连续和
        int ans = nums[0]; // 全局最大


        for(int i=1;i<nums.length;i++)
        {
            dp = Math.max(nums[i], dp + nums[i]);

            ans = Math.max(ans, dp);
        }

        return ans;
    }
}