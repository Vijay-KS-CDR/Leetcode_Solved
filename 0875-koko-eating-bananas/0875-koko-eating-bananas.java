class Solution {
    boolean canEat(int piles[],int can,int h){
        long c=0;
        for(int i:piles){
            if(i<=can){
                c++;
            }
            else{
                c+=i/can;
                if(i%can!=0){
                    c++;
                }
            }
            if(c>h) return false;
        }
        return true;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1   ;
        int r=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        int high=r;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canEat(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}