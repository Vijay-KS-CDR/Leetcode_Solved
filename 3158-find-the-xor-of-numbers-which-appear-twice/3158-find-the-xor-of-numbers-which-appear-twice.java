class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int freq[]=new int[51];
        for(int n:nums){
            freq[n]++;
        }
        int result=0;
        for(int i=1;i<51;i++){
            if(freq[i]==2){
                result^=i;
            }
        }
        return result;
    }
}