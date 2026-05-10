class Solution {
    public int heightChecker(int[] heights) {
        int[] x=heights.clone();
        Arrays.sort(x);
        int s=0;
        for(int i=0;i<heights.length;i++){
            if(x[i]!=heights[i]) s++;
        }
        return s;
    }
}