class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)-> b-a);
        for(int s:stones){
            q.add(s);
        }
        while(q.size()>1){
            int a=q.poll();
            int b=q.poll();
            if(a!=b){
                q.add(Math.abs(a-b));
            }
        }
        return q.size()==1?q.poll():0;
    }
}