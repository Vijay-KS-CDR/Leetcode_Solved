class Solution {
    public boolean checkString(String s) {
        boolean a=true;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                a=false;
            }
            if(a==false && ch=='a'){
                return false;
            }
        }
        return true;
    }
}