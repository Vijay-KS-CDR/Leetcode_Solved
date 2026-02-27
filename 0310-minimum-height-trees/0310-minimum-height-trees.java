class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1){
            return Collections.singletonList(0);
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[n];
        for(int[] a:edges){
            adj.get(a[0]).add(a[1]);
            adj.get(a[1]).add(a[0]);
            indegree[a[0]]++;
            indegree[a[1]]++;
        }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==1) q.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        while(n>2){
            int size=q.size();
            n=n-size;
            for(int i=0;i<size;i++){
                int s=q.poll();
                for(int j:adj.get(s)){
                    indegree[j]--;
                    if(indegree[j]==1){
                        q.add(j);
                    }
                }
            }
        }
        ans.addAll(q);
        return ans;
    }
}