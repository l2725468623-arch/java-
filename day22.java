class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // 第一遍：计算每个元素左边的乘积
        int left = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        // 第二遍：计算右边的乘积
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}