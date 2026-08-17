class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans=-1;
        int prev=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int temp = Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(temp<=drones[i][2]){
                if(temp<prev){
                    ans=i;
                    prev=temp;
                }
            } 
        }
        return ans;
    }
}