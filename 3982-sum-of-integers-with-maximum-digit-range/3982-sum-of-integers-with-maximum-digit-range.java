class Solution {
    int M=-10;
    int digitDiff(int a){
        int d=0;
        int min = 9;
        int max=-1;
        while(a!=0){
            int temp=a%10;
            max=Math.max(max , temp);
            min=Math.min(min,temp);
            a=a/10;
        }
        M=Math.max(M,max-min);
        return max-min;
    }
    public int maxDigitRange(int[] nums) {
        int ans=0;
        for(int num:nums){
            M=Math.max(M,digitDiff(num));
        }
        for(int i:nums){
            if(M==digitDiff(i)){
                ans+=i;
            }
        }
        return ans;
    }
}