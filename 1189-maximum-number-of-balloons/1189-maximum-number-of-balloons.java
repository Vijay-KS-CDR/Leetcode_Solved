class Solution {
    public int maxNumberOfBalloons(String text) {
        int instance = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        String s="balloon";
        for(char ch:text.toCharArray()){
            if(s.indexOf(ch)!=-1){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        return Math.min(
            Math.min(map.getOrDefault('b',0), Math.min(map.getOrDefault('a',0),map.getOrDefault('n',0))),
            Math.min(map.getOrDefault('l',0)/2 , map.getOrDefault('o',0)/2)
        );
    }
}