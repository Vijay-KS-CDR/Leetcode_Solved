class Solution {
    public int longestContinuousSubstring(String s) {
        int ans=1;
        int r=0;
        int count=1;
        for (int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)-s.charAt(i) == 1){
                count++;
            }else{
              count=1;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}