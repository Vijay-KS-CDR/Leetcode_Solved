class Solution {
     static class Pair{
        String word;
        int freq;
        Pair(String a,int b){word=a;freq=b;}
     }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> lst=new ArrayList<>();
        Queue<Pair> q=new PriorityQueue<>((a,b)->{
            if(a.freq==b.freq) return a.word.compareTo(b.word);
            return b.freq-a.freq;
        });
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String key:map.keySet()){
            q.add(new Pair(key,map.get(key)));
        }
        while(k-->0){
            lst.add(q.poll().word);
        }
        return lst;
    }
}