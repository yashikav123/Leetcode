class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int validatecount=0;
        for(int i=0;i<s.length();i++)
        {
            validatecount++;
            if(s.charAt(i)==' ')
            {
                while(i<s.length()-1 && s.charAt(i+1)==' ')
                {
                    i++;
                }
            }
        }
        int j=0;
        char[] chars=new char[validatecount];
        for(int i=0;i<s.length();i++)
        {
             chars[j++]=s.charAt(i);
             if(s.charAt(i)==' ')
             {
                 while(i<s.length()-1 && s.charAt(i+1)==' ')
                {
                    i++;
                }
             }

        }
        int start=0,end=chars.length-1;
        reversecharArray(chars,start,end);
        start=0;
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==' ')
            {
                end=i-1;
                reversecharArray(chars,start,end);
                start=i+1;

            }
        }
         reversecharArray(chars, start, chars.length - 1);
       return new String(chars);

    }
    public void reversecharArray(char []chars,int start,int end)
    {
        while(start<end)
        {
           char temp=chars[start];
           chars[start]=chars[end];
           chars[end]=temp;
           start++;
           end--;
        }
    }
}