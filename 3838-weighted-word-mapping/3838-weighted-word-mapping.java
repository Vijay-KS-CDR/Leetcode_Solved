class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<Character,Integer> map=new HashMap<>();
        int i = 0;
        for(char ch='a' ;ch<='z';ch++){
            map.put(ch,weights[i++]);
        }
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int tot=0;
            for(char ch:s.toCharArray()){
                tot+=map.get(ch);
            }
            tot=tot%26;
            sb.append((char)((25-tot)+'a'));
        }
        return sb.toString();
    }
}