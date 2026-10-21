class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int x : nums) {
            if (count == 0) candidate = x;
            if (x == candidate) 
                {
                    count = count + 1;
                } 
            else{
                    count = count - 1;
                }
        }
        return candidate;
    }
}