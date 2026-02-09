class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0){
            return true;
        }
        long left=0,right=(long)Math.sqrt(c);
        while(left<=right){
            long a=left*left+right*right;
            if(a==c){
                return true;
            }
            else if(a>c){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}