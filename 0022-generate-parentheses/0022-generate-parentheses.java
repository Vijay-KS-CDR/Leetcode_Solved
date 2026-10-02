class Solution {
    void generate(List<String> lst,int open,int close,int n,StringBuilder sb){
        if(sb.length()==n){
            lst.add(sb.toString());
            return;
        }
        if(open<n/2){
            sb.append("(");
            generate(lst,open+1,close,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            generate(lst,open,close+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        generate(lst,0,0,2*n,new StringBuilder());
        return lst;
    }
}