class Solution {
    List<String> lst = new ArrayList<>();
    void generate(int open,int close,int n,StringBuilder sb){
        if(sb.length()==2*n){
            lst.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append("(");
            generate(open+1,close,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open>close){
            sb.append(")");
            generate(open,close+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        lst.clear();
        generate(0,0,n,new StringBuilder());
        return lst;
    }
}