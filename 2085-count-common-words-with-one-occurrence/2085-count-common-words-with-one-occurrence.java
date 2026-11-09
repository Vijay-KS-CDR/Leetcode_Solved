class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String i:words1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<String> lst = new ArrayList<>(map.keySet());
        for(String s:lst){
            if(map.get(s)!=1){
                map.remove(s);
            }
        }
        for(String i:words2){
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
            }
        }
        int c = 0;
        for(String i:map.keySet()){
            if(map.get(i)==0){
                c++;
            }
        }
        return c;
    }
}