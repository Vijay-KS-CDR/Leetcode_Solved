class LRUCache {
    int c=0;
    Map<Integer,Integer> map;
    public LRUCache(int capacity) {
        c=capacity;
        map  = new LinkedHashMap<>(c,0.75f,true);
    }
    
    public int get(int key) {
        return map.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        map.put(key,value);
        if(map.size()>c){
            for(int i:map.keySet()){
                map.remove(i);
                break;
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */