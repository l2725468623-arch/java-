class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length - 1;
        int mid=(left+right)/2;
        while(left<=right)
        {
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(target>nums[i]&&target<nums[i+1])
            {
                return i+1;
            }
        }
        return nums.length;
    }
}