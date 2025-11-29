class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0,count=0;
        for(int s:nums){
            sum+=s;
        }
        while(sum%k!=0){
            sum--;
            count++;
        }
        return count;
    }
}