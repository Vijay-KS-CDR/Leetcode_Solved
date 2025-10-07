class Solution {
    int signFunc(int x){
       if(x==0){
        return 0;
       }
       return (x>0)?1:-1;
    }
    public int arraySign(int[] nums) {
        int s=1;
        for(int n:nums){
            s*=n;
        }
        return signFunc(s);
    }
}