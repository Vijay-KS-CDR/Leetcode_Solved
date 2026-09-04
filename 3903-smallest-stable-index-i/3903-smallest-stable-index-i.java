class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        int n=nums.length;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            if(prefix[i-1]<nums[i]){
                prefix[i]=nums[i];
            }else{
                prefix[i]=prefix[i-1];
            }
        }
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(suffix[i+1]>nums[i]){
                suffix[i]=nums[i];
            }
            else{
                suffix[i]=suffix[i+1];
            }
        }
        for(int i=0;i<n;i++){
            int sum = prefix[i]-suffix[i];
            if(sum<=k) return i;
        }
        return -1;
    }
}