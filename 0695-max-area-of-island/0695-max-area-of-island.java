class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        ArrayList<int[]> lst = new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    lst.add(new int[]{i,j});
                }
            }
        }
        int ans=0;
        boolean seen[][]=new boolean[n][m];
        Queue<int[]> q = new ArrayDeque<>();
        int x[]={-1,1,0,0};
        int y[]={0,0,1,-1}; 
        for(int i[]:lst){
            int a = i[0];
            int b = i[1];
            if(seen[a][b]) continue;
            int temp=1;
            q.add(new int[]{a,b});
            seen[a][b]=true;
           while(!q.isEmpty()){
                int s[]=q.poll();
                for(int j=0;j<4;j++){
                    int nx=s[0]+x[j];
                    int ny=s[1]+y[j];
                    if(nx>=0 && ny>=0 && nx<n && ny<m && seen[nx][ny]==false && grid[nx][ny]==1){
                        temp++;
                        seen[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                    }
                }
           }
           ans=Math.max(ans,temp);
        }
        return ans;
    }
}