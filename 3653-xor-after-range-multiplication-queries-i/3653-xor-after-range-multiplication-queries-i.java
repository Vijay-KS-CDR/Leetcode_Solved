class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int ans=0;
        for(int k=0;k<queries.length;k++){
            int a=queries[k][0];
            int b=queries[k][1];
            int c=queries[k][2];
            int d=queries[k][3];
            while(a<=b){
                long mul=(long)nums[a]*d;
                nums[a]=(int)(mul%(1e9+7));
                a+=c;
            }
        }
        for (int i:nums){
            ans^=i;
        }
        return ans;
    }
}