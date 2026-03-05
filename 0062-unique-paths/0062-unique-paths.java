class Solution {
    int solve(int n,int m,int i,int j,int[][]dp){
        if(i>n || j>m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==n && j==m){
            return 1;
        }
        int right= solve(n,m,i+1,j,dp);
        int bottom =solve(n,m,i,j+1,dp);
        return dp[i][j]=right+bottom;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(m-1,n-1,0,0,dp);
    }
}