class Solution {
    String seg1="";
    String seg2="";
    public String reversePrefix(String word, char ch) {
        seg2=new String(word);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                seg1=word.substring(0,i+1);
                seg2=word.substring(i+1);
                break;
            }        
        }
        seg1=new StringBuilder(seg1).reverse().toString();
        return (seg1)+seg2;
    }
}