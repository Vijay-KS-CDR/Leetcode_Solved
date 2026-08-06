class Solution {
    int product(int i){
        int mul=1;
        while(i!=0){
            mul*=i%10;
            i=i/10;
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
            if(product(i)%t==0) return i;
        return -1;
    }
}