class Solution {
    public int arrangeCoins(int n) {
        int stairs=0;
        for(int i=1;i<=n;i++){
            if((n/i)>=1){
                stairs++;
                n=n-i;
            }
            else{
                break;
            }
        }
        return stairs;
    }
}