class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();         // m 行数（和题目保持一致）
        int n = matrix[0].size();      // n 列数（和题目保持一致）

        int l = 0, r = m * n - 1;
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            // mid / n → 行号；mid % n → 列号（重点！除数是列数n）
            int val = matrix[mid / n][mid % n];
            if(val == target)
                return true;
            else if(val > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }
};
