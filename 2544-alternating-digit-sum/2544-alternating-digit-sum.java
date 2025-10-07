class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        while(n!=0){
            sum=sum*10+(n%10);
            n/=10;
        }
        int tot=0;
        boolean s=true;
        while(sum!=0){
            if(s){
                tot+=sum%10;
                s=false;
            }
            else{
                tot-=sum%10;
                s=true;
            }
            sum/=10;
        }
        return tot;
    }
}