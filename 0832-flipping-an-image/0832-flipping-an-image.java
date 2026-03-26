class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int l=0;
            int r=arr[i].length-1;
            while(l<=r){
                int temp=arr[i][l];
                arr[i][l]=(arr[i][r]^1);
                arr[i][r]=(temp^1);
                l++;
                r--;
            }
        }
        return arr;
    }
}