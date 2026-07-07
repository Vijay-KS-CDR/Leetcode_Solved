class Solution {
    int rev(int n){
        int temp=0;
        while(n!=0){
            temp=temp*10+n%10;
            n=n/10;
        }
        return temp;
    }
    public long sumAndMultiply(int n) {
        long  x = 0;
        long  sum = 0;
        n=rev(n);
        while(n!=0){
            int temp=n%10;
            if(temp==0) {
                n=n/10;
                continue;
            }
            x=x*10+temp;
            sum+=temp;
            n=n/10;
        }
        return sum * x;
    }
}