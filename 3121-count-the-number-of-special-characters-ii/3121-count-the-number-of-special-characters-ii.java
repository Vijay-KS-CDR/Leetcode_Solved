class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                map.put(c,i);
            }else{
                if(!map1.containsKey(c)){
                    map1.put(c,i);
                }
            }
        }
        int ans=0;
        for(char i:map.keySet()){
            if(map1.containsKey(Character.toUpperCase(i))){
                int a=map.get(i);
                int b=map1.get(Character.toUpperCase(i));
                if(a<b){
                    ans++;
                }
            }else{
                continue;
            }
        }
        return ans;
    }
}