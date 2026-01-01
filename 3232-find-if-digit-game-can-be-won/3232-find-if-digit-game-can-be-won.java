class Solution {
    public boolean canAliceWin(int[] nums) {
        int i=0,sum9=0,sum10=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum9+=nums[i];
            }
            else{
                sum10+=nums[i];
            }
        }
        return (sum9==sum10)?false:true;
    }
}