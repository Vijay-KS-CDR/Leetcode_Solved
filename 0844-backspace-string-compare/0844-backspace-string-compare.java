class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(char ch:s.toCharArray()){
            if(stk1.isEmpty()&& ch=='#'){
                continue;
            }
            if(ch=='#'){
                stk1.pop();
            }
            else{
                stk1.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(stk2.isEmpty()&& ch=='#'){
                continue;
            }
            if(ch=='#'){
                stk2.pop();
            }
            else{
                stk2.push(ch);
            }
        }

        while(!stk1.isEmpty()){
            char a = stk1.pop();
            if(!stk2.isEmpty()&& stk2.peek()==a){
                stk2.pop();
            }else{
                return false;
            }
        }

        return stk1.size()==stk2.size();
    }
}