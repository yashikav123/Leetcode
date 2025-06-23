class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0 ,count2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1==0 && ele2!=nums[i])
            {
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && ele1!=nums[i])
            {
                count2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1)
            {
                count1++;
            }
            else if(nums[i]==ele2)
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        List<Integer> arr =new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele1)count1++;
            if(nums[i]==ele2)count2++;
        }
        int majority=(int)(nums.length/3)+1;
        if(count1>=majority)
        {
            arr.add(ele1);
        }
        if(count2>=majority)
        {
            arr.add(ele2);
        }
        return arr;
    }
}