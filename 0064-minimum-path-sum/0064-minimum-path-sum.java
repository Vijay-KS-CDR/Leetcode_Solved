class Solution {

    int solve(int i,int j,int n,int m,int[][]dp,int grid[][]){
        if(i<0 || j<0 || i>=n || j>=m) return Integer.MAX_VALUE;
        if(i==n-1 && j==m-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        int a=solve(i,j+1,n,m,dp,grid);
        int b=solve(i+1,j,n,m,dp,grid);

        return dp[i][j]=grid[i][j]+Math.min(a,b);
        
    }

    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(0,0,n,m,dp,grid);
    }
}