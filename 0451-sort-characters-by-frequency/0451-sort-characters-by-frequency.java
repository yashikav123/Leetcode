class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length()-1;
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue <Character> q=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        for(char key:map.keySet())
        {
            q.add(key);
        }
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty())
        {
            char c=q.poll();
            for(int i=0;i<map.get(c);i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}