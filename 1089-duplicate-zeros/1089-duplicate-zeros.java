class Solution {
    void rightShift(int []arr,int s){
        for(int i=arr.length-1;i>=s;i--){
            arr[i]=arr[i-1];
        }
    }
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                rightShift(arr,i+1);
                i++;
            }
        }
    }
}