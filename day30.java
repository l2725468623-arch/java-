import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // 1. 按照区间左端点排序
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[0], b[0])
        );

        // 2. 创建集合保存结果
        List<int[]> res = new ArrayList<>();

        // 3. 遍历所有区间
        for (int[] cur : intervals) {

            // 没有重叠，直接加入
            if (res.isEmpty() ||
                res.get(res.size() - 1)[1] < cur[0]) {

                res.add(cur);

            } else {

                // 有重叠，更新右端点
                int[] last = res.get(res.size() - 1);

                last[1] = Math.max(last[1], cur[1]);
            }
        }

        // 4. ArrayList 转换为二维数组
        return res.toArray(new int[res.size()][]);
    }
}