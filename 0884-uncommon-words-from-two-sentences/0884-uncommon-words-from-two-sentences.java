class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> lst = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:s1.split("\\s+")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:s2.split("\\s+")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:map.keySet()){
            int n = map.get(s);
            if(n==1){
                lst.add(s);
            }
        }
        String ans[]=new String[lst.size()];
        int i=0;
        for(String a:lst){
            ans[i++]=a;
        }
        return ans;
    }
}