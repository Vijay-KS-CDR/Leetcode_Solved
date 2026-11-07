class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        paragraph = paragraph.replaceAll("[^a-zA-Z]"," ");
        paragraph = paragraph.toLowerCase();
        String []arr=paragraph.split("\\s+");
        int max = Integer.MIN_VALUE;
        for(String a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        } 
        for(String a:banned){
            if(map.containsKey(a)){
                map.remove(a);
            }
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