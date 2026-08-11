class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int prefix=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                prefix+=nums[i];
            }else{
                break;
            }
        }
        int i=prefix;

        while(set.contains(i)) i++;

        return i;
    }
}