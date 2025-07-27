class Solution {
    public String sortSentence(String s) {
        HashMap<Integer,String> map=new HashMap<>();
        for(String word:s.split(" "))
        {
            int lastindex=word.length()-1; //position of the digit
            int index=word.charAt(lastindex)-'0'; //digit and convert to actual number
            String originalword=word.substring(0,lastindex);
            map.put(index,originalword);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= map.size(); i++) {
            sb.append(map.get(i)).append(" ");
        }
        return sb.toString().trim();
    }
}