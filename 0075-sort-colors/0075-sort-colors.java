class Solution {
    public void sortColors(int[] nums) {
       int start=0;
       int middle=0;
       int end =nums.length-1;
       while(middle<=end)
       {
        switch(nums[middle])
        {
            case 0:
            {
            swap(nums,start,middle);
            middle++;
            start++;
            break;
            }
            case 1:
            {
                middle++;
                break;
            }
            case 2:
            {
                swap(nums,middle,end);
                end--;
                break;

            }
        }
       }
    }
       private void swap(int nums[],int pos1,int pos2)
       {
        int temp=nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]=temp;
       }
}