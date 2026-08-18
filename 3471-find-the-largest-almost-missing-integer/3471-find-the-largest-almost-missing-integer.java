class Solution {
    public int largestInteger(int[] nums, int k) {
        int freq[]=new int[51];
        for(int i=0;i<=nums.length-k;i++){
            boolean seen[]=new boolean[51];
            for(int j=0;j<k;j++){
                if(!seen[nums[j+i]]){
                    freq[nums[j+i]]++;
                }
                seen[nums[j+i]]=true;
            }
        }
        for(int i=50;i>=0;i--){
            if(freq[i]==1){
                return i;
            }
        }
        return -1;
    }
}