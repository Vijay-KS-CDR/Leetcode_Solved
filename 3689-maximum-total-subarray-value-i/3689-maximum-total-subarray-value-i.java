class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=-1;
        long min=Integer.MAX_VALUE;
        for(int a:nums){
            if(a<min){
                min=a;
            }
            if(a>max){
                max=a;
            }
        }
        return k*(max-min);
    }
}