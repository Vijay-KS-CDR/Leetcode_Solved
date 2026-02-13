class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] arr=intervals[0];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<arr[1]){
                count++;
                arr[1]=Math.min(arr[1],intervals[i][1]);
            }
            else{
                arr=intervals[i];
            }
        }
        return count;
    }
}