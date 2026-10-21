class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // 等价于 result = result ^ num
        }

        return result;
    }
}