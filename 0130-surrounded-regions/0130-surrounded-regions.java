class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean seen[][]=new boolean[n][m];
        ArrayList<int[]> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0|| i==n-1){
                     if(board[i][j]=='O'){
                        lst.add(new int[]{i,j});
                    }
                }
                else if(j==0 || j==m-1){
                    if(board[i][j]=='O'){
                        lst.add(new int[]{i,j});
                    }
                }
            }
        }
        int x[]={-1,1,0,0};
        int y[]={0,0,1,-1};
        Queue<int[]> q = new ArrayDeque<>();
        for(int i[]:lst){
            int a=i[0];
            int b=i[1];
            if(seen[a][b]==true){
                continue;
            }
            seen[a][b]=true;
            q.offer(i);
            while(!q.isEmpty()){
                int s[] = q.poll();
                for(int j=0;j<4;j++){
                    int nx=s[0]+x[j];
                    int ny=s[1]+y[j];
                    if(nx>=0 && nx<n && ny<m && ny>=0 && board[nx][ny]=='O' && seen[nx][ny]==false){
                        seen[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && seen[i][j]==false){
                    board[i][j]='X';
                }
            }
        }
    }
}