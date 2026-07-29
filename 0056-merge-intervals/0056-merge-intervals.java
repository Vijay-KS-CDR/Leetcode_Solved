class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> lst=new ArrayList<>();
        lst.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int []a=lst.get(lst.size()-1);
            int b[]=intervals[i];
            if(a[1]>=b[0]){
                lst.remove(lst.size()-1);
                lst.add(new int[]{a[0],Math.max(a[1],b[1])});
            }
            else{
                lst.add(b);
            }
        }
        int[][] ans=new int[lst.size()][];
        for(int i = 0; i < lst.size(); i++ ){
            ans[i]=lst.get(i);
        }
        return ans;

    }
}