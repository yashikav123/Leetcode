class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
        String original=s;
        String reversed=new StringBuilder(s).reverse().toString();
        String combined=s+"*"+reversed;
        int lps[]=new int[combined.length()];
        int i=0,j=1;
        while(j<combined.length())
        {
            if(combined.charAt(i)==combined.charAt(j))
            {
                lps[j]=i+1;
                i++;j++;
            }
            else if(i>0)
            {
                i=lps[i-1];
            }
            else
            {
                lps[j]=0;
                j++;
            }
        }
        int diff=n-lps[combined.length()-1];
        String toAdd=new StringBuilder(s.substring(n-diff)).reverse().toString();
        return toAdd+original;
    }
}