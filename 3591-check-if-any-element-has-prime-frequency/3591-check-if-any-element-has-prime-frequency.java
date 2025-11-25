class Solution {
    boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int s:freq){
            if(isprime(s)){
                return true;
            }
        }
        return false;
    }
}