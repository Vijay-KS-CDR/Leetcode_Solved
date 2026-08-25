class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int i=1;
        while(k*i <101  && freq[k*i]!=0){
            i++;
        }
        return k*i;
    }
}