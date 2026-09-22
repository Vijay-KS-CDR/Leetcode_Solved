class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map =  new LinkedHashMap<>();
        int i=97;
        for(char a:key.toCharArray()){
            if(!Character.isLetter(a)) continue;
            if(!map.containsKey(a)){
                map.put(a,(char)i);
                i++;
            }
        }
        StringBuilder sb =  new StringBuilder();
        for(char s:message.toCharArray()){
            if(s==' '){
                sb.append(" ");
                continue;
            }
            sb.append(map.get(s));
        }
        return sb.toString();
    }
}