class Solution {
    private static int addDigit(int n){
            int result=0;
            while(n!=0){
                result+=n%10;
                n=n/10;
            }
            return result;
    }
    public int minElement(int[] nums) {
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            nums[i]=addDigit(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<sum){
                sum=nums[i];
            }
        }
        return sum;
    }
}