class Solution {
    public String countAndSay(int n) {
         String curr="1";
         String next="";
         int currentcharcount=0;
         for(int k=1;k<n;k++)
         {
            
            int i=0;
            next="";
            while(i<curr.length())
            {
                currentcharcount=1;
            while(i<curr.length()-1&& curr.charAt(i)==curr.charAt(i+1))
            {
                currentcharcount++;
                i++;
            }
            next+=Integer.toString(currentcharcount)+curr.charAt(i);
            i++;
            }
            curr=next;
         }
         return curr;
    }
}