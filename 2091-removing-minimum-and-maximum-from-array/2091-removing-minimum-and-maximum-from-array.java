class Solution {
    public int minimumDeletions(int[] nums) {
        int mn=0; 
        int min=nums[0];
        int n=nums.length;
        int max=nums[0];
        int mx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                mn=i;
                min=nums[i];
            }
            if(nums[i]>max){
                mx=i;
                max=nums[i];
            }
        }
        int fromLeft = Math.max(mx,mn)+1;
        int fromRight = n-Math.min(mx,mn);
        int both = Math.min(mx,mn)+1+n-Math.max(mx,mn);
        return Math.min(fromLeft,Math.min(fromRight,both));
    }
}