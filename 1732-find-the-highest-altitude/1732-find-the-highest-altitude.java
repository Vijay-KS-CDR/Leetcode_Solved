class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length];
        for(int i=0;i<gain.length;i++){
            if(i==0){
            arr[i]=gain[i];
            }else{
            arr[i]=gain[i]+arr[i-1];
            }
        }
        int max=0;
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}