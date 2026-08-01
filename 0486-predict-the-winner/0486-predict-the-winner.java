class Solution {
    private boolean winner(int nums[],int p1,int p2,int i ,int j,boolean turn){
        if(i > j){
            if(p1 >= p2){
                return true;
            }
            return false;
        }
        if(turn){
            return winner(nums,p1+nums[i],p2,i+1,j,false) || winner(nums,p1+nums[j],p2,i,j-1,false);
        }else{
            return winner(nums,p1,p2+nums[i],i+1,j,true) && winner(nums,p1,p2+nums[j],i,j-1,true);
        }
    }
    public boolean predictTheWinner(int[] nums) {
        return winner(nums,0,0,0,nums.length-1,true);
    }
}