class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int left=0,right=0;
        int ans=-1;
        for(int i=nums.length-1;i>=0;i--){
            
            left=(i==0)?0:prefix[i-1];

            if(left==right){
                ans=i;
            }
            right+=nums[i];
        }
        return ans; 
    }
}