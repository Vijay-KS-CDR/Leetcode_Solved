class Pair{
    Pair(int a,int b ){
        w=a;
        idx=b;
    }
    int w;
    int idx;
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Pair> q=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            q.add(new Pair(tickets[i],i));
        } 
        int sec=0;
        boolean check=true;
        while(check && q.size()>=1){
            sec++;
            Pair a = q.poll();
            int x=a.w-1;
            int i=a.idx;
            if(x==0 && i!=k){
                q.remove(a);
            }else if(x==0){
                check=false;
            }else{
                q.add(new Pair(x,i));
            }
        }
        return sec;
    }
}