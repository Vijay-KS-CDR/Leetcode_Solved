class Solution {
    public boolean areOccurrencesEqual(String s) {
        /*HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int cur=map.get(s.charAt(0));
        for(int i:map.values()){
            if(i!=cur){
                return false;
            }
        }
        return true;*/
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int target=freq[s.charAt(0)-'a'];
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0 && freq[i]!=target){
                return false;
            }
        }
        return true;
    }
}