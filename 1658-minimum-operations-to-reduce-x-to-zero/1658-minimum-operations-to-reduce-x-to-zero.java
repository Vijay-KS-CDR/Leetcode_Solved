class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i:nums){
            total+=i;
        }
        int find = total - x;
        if(find<0) return -1;
        int ans = -1;
        int run=0,l=0,r=0;
        for(l=0;l<nums.length;l++){
            run+=nums[l];
            while(run>find){
                run-=nums[r];
                r++;
            }
            if(run==find){
                ans=Math.max(ans,l-r+1);
            }
        }
        return (ans==-1)?-1:nums.length-ans;
    }
}