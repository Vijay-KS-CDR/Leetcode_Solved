class Solution {
    public boolean isBoomerang(int[][] point) {
        int x1=point[0][0];
        int x2=point[1][0];
        int x3=point[2][0];
        int y1=point[0][1];
        int y2=point[1][1];
        int y3=point[2][1];

        double a=(0.5)*Math.abs(x3*(y1-y2)+x2*(y3-y1)+x1*(y2-y3));

        return a>0;
    }
}