class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(!stk.isEmpty()){
                    sb.append('(');
                }
                stk.push('(');
            }else{
                stk.pop();
                if(stk.isEmpty()){
                    continue;
                }
                else{
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}