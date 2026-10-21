class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> path,
                           List<List<Integer>> res) {
        // 路径长度等于数组长度，说明找到一个完整排列
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path)); // 注意：要拷贝一份
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;      // 该元素已在当前路径中，跳过

            used[i] = true;             // 做选择
            path.add(nums[i]);

            backtrack(nums, used, path, res); // 递归

            path.remove(path.size() - 1);     // 撤销选择
            used[i] = false;
        }
    }
}