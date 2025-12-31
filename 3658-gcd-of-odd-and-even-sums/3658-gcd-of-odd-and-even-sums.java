class Solution {
    int gcd(int n,int m){
        if(n==0){
            return 0;
        }
        if(m==0){
            return n;
        }
        return gcd(m,n%m);
    }
    public int gcdOfOddEvenSums(int n) {
        int even=n*(n+1);
        int odd=n*n;
        return gcd(even,odd);
    }
}