class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            List<String> lst = new ArrayList<>();
            if(s1.charAt(i)==s2.charAt(i)) continue;
            int j=i;
            while(i<s1.length() && s1.charAt(i)!=s2.charAt(i)){
                i++;
            }
            lst.add(s1.substring(j,i));
            lst.add(s2.substring(j,i));
            ans.add(lst);
            i--;
        }
    return ans;
    }
}