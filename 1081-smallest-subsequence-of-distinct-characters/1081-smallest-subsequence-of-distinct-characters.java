class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> stk=new Stack();
        boolean seen[]=new boolean[26];
        int last[]=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        for(int i = 0;i < s.length();i++){
            
            char ch = s.charAt(i);

            if(seen[ch-'a']){
                continue;
            }

            while(!stk.isEmpty() && stk.peek()>ch && last[stk.peek()-'a']>i){
                char sh=stk.pop();
                seen[sh-'a']=false;
            }
            stk.push(ch);
            seen[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char a:stk){
            sb.append(a);
        }
        return sb.toString();
    }
}