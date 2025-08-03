class Solution {
    private static final int BASE=1000000;
    public int repeatedStringMatch(String a, String b) {
        if(a.equals(b))
        {
            return 1;
        }
        int count=1;
        StringBuilder source=new StringBuilder(a);
        while(source.length()<b.length())
        {
            source.append(a);
            count++;
        }
        //check if b is a substring 
        if(source.toString().equals(b))return count;
        if(rabinkarp(source.toString(),b)!=-1) return count;
        if(rabinkarp(source.toString()+a,b)!=-1) return count+1;
        return -1;
    }
    private int rabinkarp(String source,String target)
    {
        if(source==null||target==null||source.length()<target.length()) return -1;
        int m=target.length();
        int power=1;
        for(int i=0;i<m;i++)
        {
            power=(power*31)%BASE;
        }
        int targetHash=0;
        for(int i=0;i<m;i++)
        {
            targetHash=(targetHash*31+target.charAt(i))%BASE;
        }
        int hash=0;
        for(int i=0;i<source.length();i++)
        {
            hash=(hash*31+source.charAt(i))%BASE;
            if(i<m-1) continue;
            if(i>=m)
            {
                hash=(hash-source.charAt(i-m)*power)%BASE;
                if(hash<0) hash+=BASE;
            }
            if(hash==targetHash)
            {
                if(source.substring(i-m+1,i+1).equals(target))
                {
                    return i-m+1;
                }
            }
        }
        return -1;


    }
}