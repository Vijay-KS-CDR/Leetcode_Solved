class Solution {
    public int strStr(String s, String n) {
        if(s.contains(n)){
            return s.indexOf(n);
        }
        return -1;
    }
}