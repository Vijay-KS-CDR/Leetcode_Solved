class Solution {
    public String trimTrailingVowels(String s) {
        String vow="aeiou";
        int i;
        for(i=s.length()-1;i>=0;i--){
            if(vow.indexOf(s.charAt(i))==-1){
                break;
            }
        }
        return s.substring(0,i+1);
    }
}