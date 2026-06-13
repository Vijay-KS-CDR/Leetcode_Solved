class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        int ans=0;
        int l=1,r=x;
        while(l<=r){
            long mid=l+(r-l)/2;
            long sq=mid*mid;
            if(sq==x){
                return (int)mid;
            }
            else if(sq>x){
                r=(int)mid-1;
            }
            else{
                ans=(int)mid;
                l=(int)mid+1;
            }
        }
        return ans;
    }
}