class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int s=n;
        int N=0;
        while(n!=0){
            N++;
            n>>=1;
        }
        int ans=0;
        for(int i=0;i<N;i++){
            int temp=(s&1)^1;
            ans|=(temp<<i);
            s>>=1;
        }
        return ans;
    }
}