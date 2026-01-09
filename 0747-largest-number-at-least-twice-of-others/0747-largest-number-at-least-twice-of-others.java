class Solution {
    public int dominantIndex(int[] nums) {
        int max1=-1,max2=-1,index=-1;
       for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
                index=i;
            }
            else if(max2<nums[i]){
                max2=nums[i];
            }
       }
       if(max2*2>max1){
        return -1;
       }
       return index;
    }
}