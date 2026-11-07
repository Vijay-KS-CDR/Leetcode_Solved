class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        paragraph = paragraph.replaceAll("[^a-zA-Z]"," ");
        paragraph = paragraph.toLowerCase();
        String []arr=paragraph.split("\\s+");
        int max = Integer.MIN_VALUE;
        HashSet<String> set = new HashSet(Arrays.asList(banned));
        for(String a:arr){
            if(set.contains(a)) continue;
            map.put(a,map.getOrDefault(a,0)+1);
        } 
        
        String ans = "";
        for(String a:map.keySet()){
           if(max<map.get(a)){
                ans=a;
                max = map.get(a);
           }
        }
        return ans;
    }
}