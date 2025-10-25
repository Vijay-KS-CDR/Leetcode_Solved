class Solution {
    public int totalMoney(int n) {
        int monday=1,sum=0,total=0;
        for(int i=1;i<=n;i++){
            if(sum==0){
            sum=monday;
            }
            total+=sum;
            sum++;
            if(i%7==0){
                sum=0;
                monday++;
            }
        }
        return total;
    }
}