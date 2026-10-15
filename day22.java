class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        //第一遍计算左边的乘积
        int left=1;//从左边第一个开始  此时的乘积默认为1
        for(int i=0;i<n;i++)
        {
            answer[i]=left;//此时存储的是左边的乘积
            left*=nums[i];//更新左边的乘积用于下一次计算
        }
        //第一遍结束 此时answer中存储的都是左边的乘积
        int right=1;
        for(int i=n-1;i>=0;i--)
        {
            //从末尾开始
            answer[i]*=right;//此时计算的就是左边×右边 就是结果了
            right*=nums[i];//更新右边的乘积
        }
        //结束 此时answer中就是其他的乘积
        return answer;
    }
}