class Solution {
    public long splitArray(int[] nums) {
        //seive of eratosthenes
        boolean isPrime[]=new boolean[nums.length];
        Arrays.fill(isPrime,true);
        if(nums.length<2){
            long ans=0;
            for(int i:nums){
                ans+=i;
            }
            return Math.abs(ans);
        }
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=Math.sqrt(nums.length);i++){
            if(isPrime[i]==true){
                for(int j=i*i;j<nums.length;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        long a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime[i]){
                a+=nums[i];
            }else{
                b+=nums[i];
            }
        }
        return Math.abs(a-b);
    }
}