// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int maxnum=nums[0];
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>maxnum){
//                 maxnum=nums[i];
//             }
//         }
//         //创建一个大小为maxnum+1的数组，存储每个数字出现的次数
//         ArrayList<Integer> nums2 = new ArrayList<>(maxnum+1);
//         for(int i=0;i<nums.length;i++){
//             nums2[nums[i]]++;
//         }
//         for(int i=nums2.length-1;i>=0;i--){
//             if(nums2[i]>0){
//                 k--;
//                 if(k==0){
//                     return i;
//                 }
//             }
//         }

//     }
// }
import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        //找最大值、最小值
        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        //偏移量，把min映射到下标0
        int offset = -min;
        int[] count = new int[max - min + 1];

        //统计频次
        for(int num : nums){
            count[num + offset]++;
        }
        //从最大往最小遍历
        for(int i = count.length - 1; i >= 0; i--){
            if(count[i] > 0){
                k -= count[i];
                if(k <= 0){
                    return i - offset;
                }
            }
        }
        return -1; //题目保证一定有解，不会走到这里
    }
}
