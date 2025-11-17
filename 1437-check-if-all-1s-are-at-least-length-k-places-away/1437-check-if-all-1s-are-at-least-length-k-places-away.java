class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int dis=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==0){
                    dis++;
            }
            else if(nums[i]==1){
                    if(!(dis>=k)){
                            return false;
                    }
            }
        }
        return true;
    }
}