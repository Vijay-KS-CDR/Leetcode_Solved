class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=0;
        int min=100;
        for(int n:nums){
            if(max<n){
                max=n;
            }
            if(min>n){
                min=n;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                return nums[i];
            }
        }
        return -1;
    }
}