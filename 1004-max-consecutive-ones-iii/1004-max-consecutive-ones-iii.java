class Solution {
    public int longestOnes(int[] nums, int k) {

    int r=0;
    int zc=0;
    int ans=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zc++;
        }
        while(zc>k){
            if(nums[r]==0) zc--;
            r++;
        }
        ans=Math.max(ans,i-r+1);
    }    
    return ans;
    }
}