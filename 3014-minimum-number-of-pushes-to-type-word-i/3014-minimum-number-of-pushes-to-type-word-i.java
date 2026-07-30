class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        int n=word.length();
        int ans=0,step=1;
        while(n!=0){
            if(n>=8){
                ans+=step*8;
                n-=8;
            }
            else{
                ans+=step*(n);
                break;
            }
            step++;
        }
        return ans;
    }
}