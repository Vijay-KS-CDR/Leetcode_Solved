class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        while(min!=0){
            int temp=max%min;
            max=min;
            min=temp;
        }
        return max;
    }
}