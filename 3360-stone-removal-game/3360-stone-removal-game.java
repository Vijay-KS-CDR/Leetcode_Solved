class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int t = 0;
        int i=10;
        while(n>=i){
            n=n-i;
            i--;
            t++;
        }
        if(t%2!=0) return true;
        return false;
    }
}