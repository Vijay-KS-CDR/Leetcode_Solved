class Solution {
    public int differenceOfSums(int n, int m) {
        int tot=(n*(n+1))/2;
        int k=n/m;
        int div=m*(k*(k+1))/2;
        return tot- 2*div;
    }
}