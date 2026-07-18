class Solution {
    int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int a=Arrays.stream(nums).max().getAsInt();
        int b=Arrays.stream(nums).min().getAsInt();
        return gcd(a,b);
    }
}