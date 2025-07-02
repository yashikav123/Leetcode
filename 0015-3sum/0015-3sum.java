class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();

        if(nums==null||nums.length==0)
        {
            return result;
        }
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int target=-(nums[i]+nums[j]);
                if(map.containsKey(target))
                {  int k = map.get(target);
                    if(k>j)
                    {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        String key=triplet.get(0) + ":" + triplet.get(1) + ":" + triplet.get(2);
                        if(!set.contains(key))
                        {
                            result.add(triplet);
                            set.add(key);
                        }
                    }
                }
            }
        }
        return result;
    }


}