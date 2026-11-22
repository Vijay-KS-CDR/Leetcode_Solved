class Solution {
    public boolean checkString(String s) {
        boolean b = false;
        for(char ch : s.toCharArray()){
            if(ch=='b'){
                b=true;
                continue;
            }
            if(ch=='a' && b){
                return false;
            }
        }
        return true;
    }
}