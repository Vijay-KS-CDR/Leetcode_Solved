class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean isodd = false;
        for(int i:map.values()){
            if(i%2==0){
                ans+=i;
            }else{
                ans+=(i-1);
                isodd=true;
            }
        }
        if(isodd){
            ans++;
        }
        return ans;
    }
}