class Solution {
    long reverse(int n){
        long temp=0;
        while(n!=0){
            temp=temp*10+n%10;
            n=n/10;
        }
        return temp;
    }
    public int mirrorDistance(int n) {
        return (int)Math.abs(n-reverse(n));
    }
}