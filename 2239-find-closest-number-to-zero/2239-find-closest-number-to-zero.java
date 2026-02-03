class Solution {
    public int findClosestNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
       int minpos=Integer.MAX_VALUE,minneg=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                minpos=Math.min(minpos,nums[i]);
            }
            else{
                minneg=Math.max(minneg,nums[i]);
            }
        }
        if(minneg==Integer.MIN_VALUE){
            return minpos;
        }
        if(minpos==Integer.MAX_VALUE){
            return minneg;
        }
        if(Math.abs(minneg)<minpos){
            return minneg;
        }
        else{
            return minpos;
        }
    }
}