class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        String b=String.valueOf(x);
        return s.contains(b)&& s.indexOf(b)!=0;
    }
}