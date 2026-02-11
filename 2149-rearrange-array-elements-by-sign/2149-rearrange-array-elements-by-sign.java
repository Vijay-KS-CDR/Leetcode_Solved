class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int pos=0,neg=1;
        for(int i:nums){
            if(i<0){
                res[neg]=i;
                neg=neg+2;
            }
            else{
                res[pos]=i;
                pos+=2;
            }
        }    
        return res;
    }
}