class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i=1;
        for(char ch : s.toCharArray()){
            ans+=i*(26-((ch-'a')));
            i++;
        }
        return ans;
    }
}