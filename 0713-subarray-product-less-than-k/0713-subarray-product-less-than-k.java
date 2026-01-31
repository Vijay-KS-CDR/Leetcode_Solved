class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int count=0;
        int left=0,right=0;
        int sum=1;
        for(int i=0;i<nums.length;i++){
            sum*=nums[i];
            while(sum>=k){
                sum/=nums[left++];
            }
            count+=(i-left+1);
        }
        return count;
    }
}