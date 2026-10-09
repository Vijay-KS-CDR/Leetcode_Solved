class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push('(');
            }
            else{
               if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
               }
               else{
                    ans++;
               }
               if(stk.isEmpty()){
                    ans++;
               }else{
                    stk.pop();
               }
            }
        }
        return ans+stk.size()*2;
    }
}