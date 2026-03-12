class Solution {
    public String reversePrefix(String word, char ch) {
       int i=0;
       i=word.indexOf(ch);
       if(i<0) return word;
       return new StringBuilder(word.substring(0,i+1)).reverse().append(word.substring(i+1)).toString();
    }
}