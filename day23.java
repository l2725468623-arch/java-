import java.util.ArrayList;

class Solution {
    public void rotate(int[] nums, int k) 
    {
        int len=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int n=k%len;
        for(int i=len-n;i<len;i++)
        {
            int a=nums[i];
            list.add(a);
        }
        for(int i=0;i<len-n;i++)
        {
            int a=nums[i];
            list.add(a);
        }
        for(int i=0;i<len;i++)
        {
            nums[i]=list.get(i);
        }
     
    }
}
