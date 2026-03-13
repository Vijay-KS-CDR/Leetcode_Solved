class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int gmin=nums[0];
        int gmax=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max+nums[i],nums[i]);
            gmax=Math.max(gmax,max);
            min=Math.min(min+nums[i],nums[i]);
            gmin=Math.min(gmin,min);
            sum+=nums[i];
        }
        if(gmax<0) return gmax;
        return Math.max(sum-gmin,gmax);
    }
}