class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> freq = new HashMap<>();

        Map<Character,Integer> map=new HashMap<>(); 


        for(char ch : word.toCharArray())
            freq.put(ch,freq.getOrDefault(ch,0)+1);

        ArrayList<Map.Entry<Character,Integer>> lst = new ArrayList<>(freq.entrySet());
        
        lst.sort((a,b)->(b.getValue()-a.getValue()));
        
        int level = 1;
        int count = 0;

        for(Map.Entry<Character,Integer> x : lst){
            map.put(x.getKey(),level);
            count++;
            if(count==8){
                count=0;
                level++;
            }
        }

        for(char s : map.keySet()){
            System.out.println(s+" "+map.get(s));
        }

        int ans=0;

        for(char s:freq.keySet()){
            int temp = freq.get(s)*map.get(s);
            System.out.println(temp);
            ans += temp ;
        }
        return ans;
    }
}