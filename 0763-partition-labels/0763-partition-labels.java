class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> partions=new ArrayList<>();
        int i=0;
        while(i<s.length())
        {
           int startindex=i;
           int endindex=s.lastIndexOf(s.charAt(startindex));
           for(int j=startindex+1;j<=endindex-1;j++)
           {
             int lastIndexOfNextchar=s.lastIndexOf(s.charAt(j));
             if(lastIndexOfNextchar>endindex)
             {
                endindex=lastIndexOfNextchar;

             }

           }
           partions.add(endindex-startindex+1);
           i=endindex+1;
        }
        return partions;
    }
}