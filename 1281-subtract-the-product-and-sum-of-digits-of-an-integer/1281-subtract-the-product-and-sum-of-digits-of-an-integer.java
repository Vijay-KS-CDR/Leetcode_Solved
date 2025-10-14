class Solution {
    public int subtractProductAndSum(int n) {
        int pdt=1;
        int sum=0;
        while(n!=0){
            pdt*=n%10;
            sum+=n%10;
            n=n/10;
        }
        return pdt-sum;
    }
}