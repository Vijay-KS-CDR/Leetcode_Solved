class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(r*c!=n*m){
            return mat;
        }
        int arr[]=new int[n*m];
        int ans[][]=new int[r][c];
        int k = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=mat[i][j];
            }
        }
        k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[k++];
            }
        }
        return ans;
    }
}