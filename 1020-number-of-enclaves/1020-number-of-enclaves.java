class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean seen[][]=new boolean[n][m];
        ArrayList<int[]> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(grid[i][j]==1){
                        lst.add(new int[]{i,j});
                    }
                }
            }
        }
        int ans=0;
        Queue<int[]> q = new LinkedList<>();
        int x[]={-1,1,0,0};
        int y[]={0,0,1,-1};
        for(int j[]:lst){
            int a = j[0];
            int b = j[1];
            if(seen[a][b]==true) continue;
            q.add(new int[]{a,b});
            seen[a][b]=true;
            while(!q.isEmpty()){
                int s[]=q.poll();
                for(int i=0;i<4;i++){
                    int nx=s[0]+x[i];
                    int ny=s[1]+y[i];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && seen[nx][ny]==false && grid[nx][ny]==1){
                        seen[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(seen[i][j]==false && grid[i][j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}