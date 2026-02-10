class Solution {
    public int countMonobit(int n) {
        if(n==0){
            return 1;
        }
        int sum=0;
        int pow=2;
        while((pow-1)<=n){
            pow=pow*2;
            sum+=1;
        }
        return sum+1;
    }
}