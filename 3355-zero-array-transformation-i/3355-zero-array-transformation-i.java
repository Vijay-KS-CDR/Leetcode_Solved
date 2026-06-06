class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        //sweep line algorithm
        int[] diff=new int[nums.length];
        for(int i[]:queries){
            int a=i[0],b=i[1];
            diff[a]+=-1;
            if(b+1<nums.length){
                diff[b+1]+=1;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=diff[i];
            if(nums[i]+sum>0){
                return false;
            }
        }
        return true;
    }
}