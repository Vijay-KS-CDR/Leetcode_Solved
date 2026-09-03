class Solution {
    public boolean uniformArray(int[] nums) {
        int minOdd=(int)1e9;
        int minEven=(int)1e9;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(minEven>nums[i]) minEven=nums[i];
            }else{
                if(minOdd>nums[i]) minOdd=nums[i];
            }
        }
        int c=(int)1e9;
        if(minOdd==c || minEven==c) return true;
        return ((minEven-minOdd)>0)?true:false;
    }
}