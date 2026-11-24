class Solution {
    public int countDominantElements(int[] nums) {
        int ans = 0;
        if(nums.length>=3){
        for(int i=1;i<nums.length-1;i++){
            int avg = (nums[i-1]+nums[i+1]);
            if(2*nums[i]>=avg) ans++;
        }
        }
        if(nums.length==1){
            return 1;
        }
        if(nums.length>=2 && nums[0]>=nums[1]){
            ans++;
        }
        if(nums.length>=2 && nums[nums.length-1]>=nums[nums.length-2]){
            ans++;
        }
        return ans;
    }
}