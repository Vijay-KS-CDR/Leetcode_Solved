class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=Arrays.stream(candies).max().getAsInt();
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isWork(mid,candies,k)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
    boolean isWork(int t,int [] arr,long tar){
        long sum=0;
        for(int i:arr){
            sum+=(i/t);
            if(sum>=tar){
                return true;
            }
        }
        return false;
    }
}