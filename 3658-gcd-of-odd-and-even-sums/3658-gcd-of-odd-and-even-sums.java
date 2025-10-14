class Solution {
    private int gcd(int a,int b){
        int ans=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                ans=i;
            }
        }
        return ans;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        return gcd(odd,even);
    }
}