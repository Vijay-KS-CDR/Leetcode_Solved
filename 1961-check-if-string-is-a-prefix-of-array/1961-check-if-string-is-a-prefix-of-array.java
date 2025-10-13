class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(s.contains(words[i])){
            sb.append(words[i]);
            if(s.equals(sb.toString())){
                return true;
            }
            }
            else{
                return false;
            }
        }
        return false;
    }
}