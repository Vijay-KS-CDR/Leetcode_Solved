class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        max[0]=nums[0];
        min[nums.length-1]=nums[nums.length-1];
        int temp1=max[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>temp1){
                temp1=nums[i];
            }
            max[i]=temp1;
        }
        int temp2=min[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<temp2){
                temp2=nums[i];
            }
            min[i]=temp2;
        }
        for(int i=0;i<nums.length;i++){
            if(max[i]-min[i] <=k){
                return i;
            }
        }
        return -1;
    }
}