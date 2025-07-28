class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();
        String currentstring="";
        int k=0;

        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                k=k*10+(c-'0');
            }
            else if(c=='[')
            {
                numStack.push(k);
                stringStack.push(currentstring);
                k=0;
                currentstring="";
            }
            else if(c==']')
            {
                int repeat=numStack.pop();
                StringBuilder sb=new StringBuilder(stringStack.pop());
                for(int i=0;i<repeat;i++)
                {
                   sb.append(currentstring);
                }
                currentstring=sb.toString();
            }
            else
            {
                currentstring+=c;
            }

        }
        return currentstring;
    }
}