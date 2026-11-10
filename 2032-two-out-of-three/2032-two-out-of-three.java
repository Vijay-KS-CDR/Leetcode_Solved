class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> lst  = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            if(map.containsKey(i)) continue;
            map.put(i,1);
        }
        HashMap<Integer,Integer> two = new HashMap<>(); 
        for(int i:nums2){
            if(two.containsKey(i)) continue;
            map.put(i,map.getOrDefault(i,0)+1);
            two.put(i,0);
        }
        HashMap<Integer,Integer> three = new HashMap<>();
        for(int i:nums3){
            if(three.containsKey(i)) continue;
            three.put(i,0);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                lst.add(i);
            }
        }
        return lst;
    }
}