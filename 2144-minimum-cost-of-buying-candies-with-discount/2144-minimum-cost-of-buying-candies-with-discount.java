class Solution {
    void reverse(int[] cost){
        int l=0,r=cost.length-1;
        while(l<r){
            int temp=cost[l];
            cost[l]=cost[r];
            cost[r]=temp;
            l++;
            r--;
        }
    }
    public int minimumCost(int[] cost) {
       Arrays.sort(cost);
       reverse(cost);
       int price=0;
       int j=1;
       for(int i=0;i<cost.length;i++){
            price+=cost[i];
            if(j%2==0){
                i++;
            }
            j++;
       }
       return price;
    }
}