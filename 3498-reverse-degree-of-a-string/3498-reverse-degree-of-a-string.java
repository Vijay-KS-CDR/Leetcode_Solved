class Solution {
    public int reverseDegree(String str) {
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=(1+i)*(26-(str.charAt(i)-'a'));
        }
        return sum;
    }
}