class Solution {
    int solve(char a[],char b[],int i,int j,int[][]dp){
        if(i<0 || j<0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];

        if(a[i]==b[j]) return 1+(solve(a,b,i-1,j-1,dp));

        return dp[i][j] = Math.max(solve(a,b,i-1,j,dp),solve(a,b,i,j-1,dp));

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }

        return solve(text1.toCharArray(),text2.toCharArray(),text1.length()-1,text2.length()-1,dp);
    }
}