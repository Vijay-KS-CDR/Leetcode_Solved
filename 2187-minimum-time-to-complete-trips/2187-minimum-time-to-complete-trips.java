class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        if(time.length==0){
            return 0;
        }
        long ans=Long.MAX_VALUE;
        long left=1,right=(long)Arrays.stream(time).min().getAsInt()*totalTrips;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(isOkay(mid,time,totalTrips)){
                right=mid-1;
                ans=Math.min(ans,mid);
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    boolean isOkay(long mid,int[]arr,int k){
        long sum=0;
        for(int i:arr){
            sum+=mid/i;
            if(sum>=k){
                return true;
            }
        }
        return false;
    }
}