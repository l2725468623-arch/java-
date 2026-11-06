class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> result;
        if (nums.empty() || k <= 0) {
            return result;
        }
        deque<int> dq; // stores indices
        for (int i = 0; i < nums.size(); i++) {
            // Remove indices that are out of the current window
            while (!dq.empty() && dq.front() <= i - k) {
                dq.pop_front();
            }
            // Remove indices whose corresponding values are less than the current value
            while (!dq.empty() && nums[dq.back()] < nums[i]) {
                dq.pop_back();
            }
            dq.push_back(i);
            // Add the maximum value of the current window to the result
            if (i >= k - 1) {
                result.push_back(nums[dq.front()]);
            }
        }
        return result;  
    }
};