class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1){
            if(s.equals("1")) return true;
            else return false;
        }
        char ch[]=s.toCharArray();
        int cnt=0;
        for(char c:ch){
            if(c=='1'){
                cnt++;
            }
        }
        boolean b=false;
        for(char c:ch){
            if(b && c=='0'){
                break;
            }
            if(c=='1') {
                cnt--;
                b=true;
            }
        }
        return cnt==0;
    }
}