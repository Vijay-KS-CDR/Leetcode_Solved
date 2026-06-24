class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int ans[]=new int[arr.length];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            ans[i]=temp^arr[i];
            temp=ans[i];
        }
        int res[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            if(q[i][0]==0){
                res[i]=ans[q[i][1]];
            }
            else{
                res[i]=ans[q[i][0]-1]^ans[q[i][1]];
            }
        }
        return res;
    }
}