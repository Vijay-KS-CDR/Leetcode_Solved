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
        if(minEven==(int)1e9){
            minEven=0;
        }
         if(minOdd==(int)1e9){
            minOdd=0;
        }
        System.out.println(minEven+" "+minOdd);
        if(minOdd==0 || minEven==0) return true;
        return ((minEven-minOdd)>0)?true:false;
    }
}