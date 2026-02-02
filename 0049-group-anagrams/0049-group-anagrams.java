class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String temp=String.valueOf(c);
            map.putIfAbsent(temp,new ArrayList<>());
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}