class Solution {
    public int smallestEqual(int[] nums) {
        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i%10 == nums[i]){
                result=Math.min(i,result);
            }
        }
        return result==Integer.MAX_VALUE ? -1:result;
    }
}