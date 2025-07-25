class Solution {
    public int beautySum(String s) {
        int sum=0;
       
        int n=s.length();
        for(int i=0;i<n;i++)
        {   int freq[]=new int[26];
            for(int j=i;j<n;j++)   // subsequence
            {
                freq[s.charAt(j)-'a']++;   // increament where the a is(position)
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;  // once loop ends need to reset
                for(int k=0;k<26;k++)   // loop for array to chack the count's min max
                {
                    if(freq[k]>0)
                    {
                     max=Math.max(max,freq[k]);
                     min=Math.min(min,freq[k]);
                    }
                }
                sum+=(max-min);
            }
        }
            return sum;
    }
}