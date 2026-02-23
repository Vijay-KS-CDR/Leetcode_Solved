class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(k>s.length()) return false;
        HashSet<String> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=0;i<k;i++){
            sb.append(ch[i]);
        }
        set.add(sb.toString());
        for(int i=k;i<s.length();i++){
            sb.append(ch[i]);
            sb.deleteCharAt(0);
            set.add(sb.toString());
            if(set.size()==(1<<k)){
                return true;
            }
        }
         if(set.size()==(1<<k)){
                return true;
            }
            return false;
    }
}