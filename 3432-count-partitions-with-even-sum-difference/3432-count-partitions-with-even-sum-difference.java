class Solution {
    public int countPartitions(int[] nums) {
        int tot=0;
        for(int i:nums){
            tot+=i;
        }
        int res=0;
        int s=0;
        for(int i=0;i<nums.length-1;i++){
            s+=nums[i];
            if((s-(tot-s))%2==0){
                res++;
            }
        }
        return res;
    }
}