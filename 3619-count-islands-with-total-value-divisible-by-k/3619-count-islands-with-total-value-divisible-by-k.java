class Solution {
    public int countIslands(int[][] grid, int k) {
        int count = 0;
        ArrayList<int[]> lst = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0){
                    lst.add(new int[]{i,j});
                }
            }
        }
        int x[]={0,0,1,-1};
        int y[]={1,-1,0,0};
        for(int a[]:lst){
            long sum = 0;
            int i=a[0];
            int j=a[1];
            if(visited[i][j]){
                continue;
            }
            Queue<int[]> q = new LinkedList<>();
            visited[i][j]=true;
            q.add(a);
            while(!q.isEmpty()){
                int cur[]=q.poll();
                int ia=cur[0];
                int ja=cur[1];
                sum+=grid[ia][ja];
                for(int is=0;is<4;is++){
                    int nx = ia+x[is];
                    int ny = ja+y[is];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && grid[nx][ny]>0 && visited[nx][ny]==false){
                        q.add(new int[]{nx,ny});
                        visited[nx][ny]=true;
                    }
            }
            }
            if(sum%k==0) count++;
        }
        return count;
    }
}