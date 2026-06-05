class Solution {
    boolean solve(int[]arr,int x){
        int prev=-1;
        for(int i=0;i<arr.length;i++){
            if(i==x){
                continue;
            }
            int cur=arr[i];
            if(prev>=cur){
                return false;
            }
            prev=cur;
        }
        return true;
    }
    public boolean canBeIncreasing(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(solve(nums,i)){
               return  true;
            }
        }
        return false;
    }
}