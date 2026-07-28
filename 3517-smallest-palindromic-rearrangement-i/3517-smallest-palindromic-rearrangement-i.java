class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        char mid='\0';
        for(int i = 0;i<26;i++){
            int len=freq[i]/2;
            while(len-->0){
                sb.append((char)(i+'a'));
            }
            if((freq[i]&1)==1){
                mid=(char)(i+'a');
            }
        }
        StringBuilder ans=new StringBuilder();
        ans.append(sb);
        if(mid!='\0')
            ans.append(mid);
        ans.append(sb.reverse());
        return ans.toString();
    }
}