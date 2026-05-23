class Solution {
    public int minimumSwaps(int[] nums) {
        int zero=0;
        int ans=0;
        for(int x:nums){
            if(x==0){
                zero++;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){
                zero--;
            }
            else if(zero>0){
                ans++;
                zero--;
            }
        }
        return ans;
    }
}