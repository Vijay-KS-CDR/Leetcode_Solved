class Solution {
    void transpose(int [][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    void reverse(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int l=0;
            int r=arr[i].length-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }
    }
    boolean check(int[][] arr,int tar[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=tar[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            transpose(mat);
            reverse(mat);
            if(check(mat,target)) return true;
        }
        return false;
    }
}