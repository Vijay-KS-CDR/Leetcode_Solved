class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(String i:words){
            ans++;
            for(int j=0;j<i.length();j++){
                if(allowed.indexOf(i.charAt(j))==-1){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}