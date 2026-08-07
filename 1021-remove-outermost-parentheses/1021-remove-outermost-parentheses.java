class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(!stk.isEmpty()){
                    sb.append('(');
                }
                stk.push('(');
            }
            else{
                stk.pop();
                if(!stk.isEmpty()){
                    sb.append(')');
                }
            }
        }
        
        return sb.toString();
    }
}