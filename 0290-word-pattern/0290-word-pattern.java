class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>map1=new HashMap<>();
        String word[]=s.split("\\s+");
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!(map.get(pattern.charAt(i)).equals(word[i]))){
                return false;
                }
            }
            else{
            map.put(pattern.charAt(i),word[i]);
            }
            if(map1.containsKey(word[i])){
                if(map1.get(word[i])!=pattern.charAt(i)){
                    return false;
                }
            }else{
                map1.put(word[i],pattern.charAt(i));
            }
        }
        return true;
    }
}