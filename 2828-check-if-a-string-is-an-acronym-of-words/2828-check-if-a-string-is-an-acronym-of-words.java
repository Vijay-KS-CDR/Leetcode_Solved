class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean ans= false;
        if(s.length()!=words.size()){
            return ans;
        }
        int i=0;
        for(String a:words){
            char x=a.charAt(0);
            char y=s.charAt(i);
           
            if(x!=y) return ans;
            i++;
        }
        return true;
    }
}