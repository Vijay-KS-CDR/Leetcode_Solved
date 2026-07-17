class Solution {
    public int findCenter(int[][] edges) {
        int freq[]=new int [edges.length+2];
        for(int i = 0; i < edges.length ; i++){
            int a[]=edges[i];
            freq[a[0]]++;
            freq[a[1]]++;
        }
        int max=0,ans=0;
        for(int i = 0;i<freq.length;i++){
            if(max<freq[i]){
                max=freq[i];
                ans=i;
            }
        }
        return ans;
    }
}