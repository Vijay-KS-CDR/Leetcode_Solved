class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=n*(n+1);
        int odd=n*n;
        while(odd!=0){
            int rem=even%odd;
            even=odd;
            odd=rem;
        }
        return even;
    }
}