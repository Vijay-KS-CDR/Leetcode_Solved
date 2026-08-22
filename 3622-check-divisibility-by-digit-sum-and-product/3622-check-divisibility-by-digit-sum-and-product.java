class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int temp=n;
        while(n!=0){
            int s=n%10;
            sum+=s;
            mul*=s;
            n=n/10;
        }
        return temp%(sum+mul)==0;
    }
}