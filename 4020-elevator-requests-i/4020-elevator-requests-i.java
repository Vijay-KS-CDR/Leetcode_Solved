class Solution {
    public int elevatorRequests(int n, int[] req){
        int ans=0;
        int prev=0;
        for(int i=0;i<req.length;i++){
            ans+=Math.abs(req[i]-prev);
            prev=req[i];
        }
        return ans;
    }
}