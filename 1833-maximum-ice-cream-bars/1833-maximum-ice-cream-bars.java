class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans=0;
        int i=0;
        while(coins>0 && i<costs.length){
            coins-=costs[i++];
            if(coins>=0){
            ans++;
            }
        }
        return ans;
    }
}