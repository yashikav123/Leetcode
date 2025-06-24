class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seq=new HashSet<>();
        for(int num:nums)
        {
            seq.add(num);
        }
        int max=0;
        List<Integer> uniqueList = new ArrayList<>(seq);
         for(int i = 0; i < uniqueList.size(); i++)
         {
            int num = uniqueList.get(i);
            if(seq.contains(num-1))
            {
                continue;
            }
            int currentlength=0;
            while(seq.contains(num))
            {
                currentlength++;
                num++;
            }
            max=Math.max(max,currentlength);
         }
         return max;
    }
}