class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap();
        for(int i=0;i<s.length();i++){
            map.putIfAbsent(s.charAt(i),t.charAt(i));
            char k=map.get(s.charAt(i));
            if(k!=t.charAt(i)){
                return false;
            }
        }
        HashSet<Character> set=new HashSet<Character>();
        for(char ch:map.values()){
            set.add(ch);
        }

        return set.size()==map.size();
    }
}