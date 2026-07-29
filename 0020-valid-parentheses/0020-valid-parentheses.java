class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        char[] arr=s.toCharArray();
        if(arr.length%2!=0) return false;
        for(char ch:arr){
            if(ch=='{' || ch=='[' || ch=='('){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty()) return false;
                if(( ch=='}' && stk.peek()=='{' ) || (ch==']' && stk.peek()=='[') || (ch==')' && stk.peek()=='(') ){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stk.size()==0;
    }
}