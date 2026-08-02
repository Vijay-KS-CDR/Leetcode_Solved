class Solution {
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        long ans=0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int g=gcd(nums[i],nums[j]);
                ans=Math.max(ans,((1L*nums[i]*nums[j])/(1L*g*g)));
            }
        }
        return ans;
    }
}