class Solution {
    int gcd(int a,int b){
        while(b!=0){
            int tem=a%b;
            a=b;
            b=tem;
        }
        return a;
    }
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y){
            return false;
        }
        if(x+y==target || x==target || y==target){
            return true;
        }
        if(target%gcd(x,y)==0){
            return true;
        }
        return false;
    }
}