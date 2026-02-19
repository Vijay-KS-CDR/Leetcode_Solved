class Solution {
    List<String> lst= new ArrayList<>();
    void solve(int idx,String digits,String arr[],StringBuilder sb){
        if(idx==digits.length()){
            lst.add(sb.toString());
            return;
        }
        String s=arr[digits.charAt(idx)-'0'];
        for(int i=0;i<s.length();i++){
            solve(idx+1,digits,arr,sb.append(s.charAt(i)));
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            lst.add("");
            return lst;
        }
        String[] arr= {
            "",//0
            "",//1
            "abc",//2
            "def",//3
            "ghi",//4
            "jkl",//5
            "mno",//6
            "prqs",//7
            "tuv",//8
            "wxyz",//9
        };
        solve(0,digits,arr,new StringBuilder());
        return lst;
    }
}