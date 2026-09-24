class Solution {
    public boolean isIsomorphic(String a, String b) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(i==a.length() || i==b.length()){
                break;
            }
            if(map1.containsKey(a.charAt(i))){
                if(map1.get(a.charAt(i))!=b.charAt(i)){
                    return false;
                }
            }
            if(map2.containsKey(b.charAt(i))){
                if(map2.get(b.charAt(i))!=a.charAt(i)){
                    return false;
                }
            }
            map1.putIfAbsent(a.charAt(i),b.charAt(i));
            map2.putIfAbsent(b.charAt(i),a.charAt(i));
        }
        return true;
    }
}