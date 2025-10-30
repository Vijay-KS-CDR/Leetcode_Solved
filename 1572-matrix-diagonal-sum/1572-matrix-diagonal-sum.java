class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<mat.length;i++){
            sum1+=mat[i][i];
        }
        if(mat.length==1){
            return sum1;
        }
        for(int i=0;i<mat.length;i++){
            if(i==mat.length-1-i){
                continue;
            }
            sum2+=mat[i][mat[0].length-1-i];
        }
        return sum1+sum2;
    }
}