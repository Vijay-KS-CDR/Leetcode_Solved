class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        int left=0,right=0;
        for(int i=0;i<nums.length;i++){
            prefix[i]=left;
            left+=nums[i];
        }
         for(int i=nums.length-1;i>=0;i--){
            suffix[i]=right;
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(prefix[i]-suffix[i]);
        }
        return nums;
    }
}