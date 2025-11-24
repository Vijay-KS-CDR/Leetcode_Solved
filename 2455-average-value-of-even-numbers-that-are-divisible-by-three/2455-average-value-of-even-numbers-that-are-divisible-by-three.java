class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int c:nums){
            if(c%2==0 && c%3==0){
                sum+=c;
                count++;
            }
        }
        return count==0?0:sum/count;
    }
}