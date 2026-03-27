class Solution {
    void shifter(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int temp=arr[i][0];
            for(int j=1;j<arr[i].length;j++){
                arr[i][j-1]=arr[i][j];
            }
            arr[i][arr[i].length-1]=temp;
        }
    }
    boolean check(int arr1[][],int nums[][]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(arr1[i][j]!=nums[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat[0].length;
        if(k%n==0) return true;
        int shifts=k%n;
        int arr[][]=new int[mat.length][];
        for(int i=0;i<mat.length;i++){
            arr[i]=Arrays.copyOf(mat[i],mat[i].length);
        }
        for(int i=0;i<shifts;i++){
            shifter(arr);
        }
        return check(arr,mat);
    }
}