class Solution {
    public int singleNumber(int[] nums) {
        int i,j;
        int xor=0;
        for(i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
    }
}