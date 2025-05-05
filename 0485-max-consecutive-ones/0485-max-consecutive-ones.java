class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0,max_count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                 count++;
                 max_count=Math.max(count,max_count);
            }
            else
            {
                count=0;
            }
        }
        return max_count;
    }
}