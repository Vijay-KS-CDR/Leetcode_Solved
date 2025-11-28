class Solution {
    public int scoreOfString(String s) {
        char []arr=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}