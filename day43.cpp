#include <vector>
using namespace std;

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans(2, -1);
        if (nums.empty()) return ans;

        // 找左边界：第一个等于target的位置
        int left = 0, right = nums.size() - 1;
        int leftBound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                leftBound = mid;
                right = mid - 1; // 继续往左边搜，看前面还有没有target
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (leftBound == -1) return ans; // 直接没找到target，返回[-1,-1]

        // 找右边界：最后一个等于target的位置
        left = 0, right = nums.size() - 1;
        int rightBound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                rightBound = mid;
                left = mid + 1; // 继续往右边搜，看后面还有没有target
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        ans[0] = leftBound;
        ans[1] = rightBound;
        return ans;
    }
};
