class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min=Integer.MAX_VALUE;
        for(int n:prices){
            if(min>n){
                min=n;
            }
            else{
                max = Math.max(max,n-min);
            }
        }
        return max;
    }
}