class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        int n=apple.length,m=capacity.length;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int tot=0,sum1=0;
        for(int i=m-1;i>=0;i--){
            sum1+=capacity[i];
            tot++;
            if(sum1>=sum){
                return tot;
            }
        }
        return 0;
    }
}