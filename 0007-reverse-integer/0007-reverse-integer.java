class Solution {
    public int reverse(int x) {
        int c = 0;
        if(x<0){
            x = -x;
            c=1;
        }
        long rev=0;
        while(x!=0){
            int a = x % 10;
            rev = rev*10 + a;
            x = x/10;
        }
        if(rev >Integer.MAX_VALUE || rev <Integer.MIN_VALUE){
            return 0;
        }
        return (c == 0) ?(int) rev : (int)-rev;
    }
}