class Solution {
    int solve(int i,int j,char[]a,char []b,int [][]dp){
        if( i<0 ||  j<0 ) return 0;
        int s=dp[i][j];
        if(s!=-1) return s;
        if(a[i]==b[j]){
            return dp[i][j]=1+solve(i-1,j-1,a,b,dp);
        }
        return dp[i][j]=Math.max(solve(i-1,j,a,b,dp),solve(i,j-1,a,b,dp));
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length()-1;
        int m=word2.length()-1;
        int dp[][]=new int[n+1][m+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        int ans=solve(n,m,word1.toCharArray(),word2.toCharArray(),dp);
        return 2+m+n-2*ans;
    }
}