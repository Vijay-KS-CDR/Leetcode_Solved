class Solution {
    private boolean isDivide(int n,int x){
            if(n%x==0){
                return true;
            }
            return false;
    }
    public int countDigits(int num) {
        int c=0,temp=num;
        while(temp!=0){
            if(isDivide(num,temp%10)){
                c++;
            }
            temp=temp/10;
        }
        return c;
    }
}