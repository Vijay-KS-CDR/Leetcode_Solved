class Solution {
    public boolean canFinish(int crs, int[][] rel) {
        int indegree[] = new int[crs];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<crs;i++){
            adj.add(new ArrayList<>());
        }
        for(int []i:rel){
            int a = i[0];
            int b = i[1];
            adj.get(i[1]).add(i[0]);
            indegree[i[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<crs;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int a = q.poll();
            for(int s:adj.get(a)){
                if(indegree[s]>0){
                    indegree[s]-=1;
                }
                if(indegree[s]==0){
                    q.add(s);
                }
            }
        }
        for(int i=0;i<crs;i++){
            if(indegree[i]>0){
                return false;
            }
        }
        return true;
    }
}