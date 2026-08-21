class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        boolean seen[]=new boolean[n];
        seen[src]=true;
        if(src==des) return true;
        while(!q.isEmpty()){
            int s = q.poll();
            for(int i:adj.get(s)){
                if(seen[i]) continue;
                if(i==des) return true;
                seen[i]=true;
                q.add(i);
            }
        }
        return false;
    }
}