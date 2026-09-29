class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        Stack<Character> stk = new Stack();
        int c = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                stk.push(ch);
                c++;
            }
            if(ch==')'){
                stk.pop();
                c--;
            }
            ans = Math.max(ans,c);
        }
        return ans;
    }
}