class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> ans = new ArrayList<>();
     for(int i=0;i<n;i++)
     {    List<Integer> temp = new ArrayList<>();
        for(int j=0;j<=i;j++)
        {
            if(j==0||j==i)
            {
                 temp.add(1);
            }
            else
            {
                List<Integer> prev=ans.get(i-1);
                temp.add(prev.get(j)+prev.get(j-1));
            }
        }
        ans.add(temp);
     } 
        return ans;

    }
}