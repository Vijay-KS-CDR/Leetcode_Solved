class Solution {
    int ans=0;
    void sGen(int []nums,int idx,int or){
        if(idx==nums.length){
            ans+=or;
            return;
        }
        sGen(nums,idx+1,or^nums[idx]);
        sGen(nums,idx+1,or);
    }
    public int subsetXORSum(int[] nums) {
        sGen(nums,0,0);
        return ans;
    }
}