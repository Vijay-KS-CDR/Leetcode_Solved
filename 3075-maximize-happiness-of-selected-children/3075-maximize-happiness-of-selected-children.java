class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0,s=0;;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=0 && k!=0;i--){
            long temp=happiness[i]-s;
            if(temp<0){
                continue;
            }
            sum+=temp;
            k--;
            s++;
        }
        return sum;
    }
}