class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
              String temp=sb.reverse().toString();
              sb.delete(0,i);
              sb.append(temp);
            }
            else{
            sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}